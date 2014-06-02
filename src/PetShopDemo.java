/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-3-24
 */
interface Pet {
    public abstract String getName();			// 得到宠物的名字
    public abstract String getFeature();			// 得到宠物的颜色
    public abstract int getAge();				// 得到宠物的年龄
}


class Cat implements Pet {
    private String name;				// 宠物名字
    private String feature;				// 宠物颜色
    private int age;				// 宠物年龄
    public Cat(String name,
               String feature, int age) {		// 通过构造设置属性
        this.setName(name) ;
        this.setFeature(feature) ;
        this.setAge(age) ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return feature;
    }

    @Override
    public int getAge() {
        return age;
    }
    // setter、getter
}


class Dog implements Pet {
    private String name;			// 宠物名字
    private String feature;			// 宠物颜色
    private int age;			// 宠物年龄
    public Dog(String name,
               String feature, int age) {	// 通过构造设置属性
        this.name = name;
        this.feature = feature;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFeature() {
        return feature;
    }

    @Override
    public int getAge() {
        return age;
    }
    // setter、getter
}
class PetShop {
    private Pet[] pets;				// 保存多个属性
    private int num;				// 数据的保存位置
    private int sum;				// 数据的保存位置
    public PetShop(int len) {				// 构造方法开辟宠物数组的大小
        if(len>0){				// 判断长度是否大于0
            this.pets = new Pet[len];		// 为对象数组开辟空间
        }else{
            this.pets = new Pet[len] ;		// 至少开辟一个空间
        }
        this.sum = len;
        num = 0;
        System.out.println("创建了一个宠物商店，有"  + len + "个空间,现有" + num + "个宠物。");


    }
    public boolean add(Pet pet) {			// 增加宠物
        if (num < this.pets.length) {		// 判断宠物商店里的宠物是否已经满了
            this.pets[num] = pet;		// 增加宠物
            num++;				// 修改保存位置
            System.out.print("宠物登陆：" + pet.getName() + "\t" + pet.getFeature() + "\t" + pet.getAge());
            System.out.printf(" \t空间：%d/%d%n", num, sum);
            return true;			// 增加成功
        } else {
            System.out.printf(" \t空间已满, %s 无法登陆，被扔出。\n",pet.getName() );
            return false;			// 增加失败
        }
    }
    public Pet[] get(){
        System.out.printf("宠物店现有%d个空间，共有%d个宠物。\n",sum, num);
        return pets;
    }
    public Pet[] search(String keyWord){ 	// 关键字查找
        Pet p[];			// 此为查找之后的结果，此处的大小不是固定的
        int count = 0;			// 记录下多少个宠物符合查询结果
        // 确认开辟的空间大小，看有多少个宠物符合查询条件
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {	//判断对象数组中的内容是否为空
                if (this.pets[i].getName().indexOf(keyWord) != -1
                        || this.pets[i].getFeature().indexOf(keyWord) != -1) {
                    count++;	// 统计符合条件的宠物个数
                }
            }
        }
        p = new Pet[count];			// 根据已经确定的记录数，开辟对象数组
        int f = 0;			// 设置增加的位置标记
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] != null) {
                if (this.pets[i].getName().indexOf(keyWord) != -1
                        || this.pets[i].getFeature().indexOf(keyWord) != -1) {
                    p[f] = this.pets[i]; // 将符合查询条件的宠物信息保存
                    f++;
                }
            }
        }
        return p;
    }
}
public class PetShopDemo {
    public static void main(String args[]) {
        PetShop shop = new PetShop(5);			// 五个宠物
        shop.add(new Cat("小白", "黑色的", 8));      // 增加宠物，成功
        shop.add(new Cat("大黄", "白色的", 3));
        shop.add(new Cat("凯蒂", "没有嘴", 3));
        shop.add(new Cat("叮当", "没有耳朵", 3));
        shop.add(new Dog("丢丢", "灰色的", 3));
        shop.add(new Dog("道格", "金色的", 3));
        shop.add(new Dog("卡拉", "黑色的", 3));
        print(shop.get());
        //print(shop.search("没有嘴"));

    }
    public static void print(Pet p[]) {			// 输出操作
        for (int i = 0; i < p.length; i++) {		// 循环输出
            if (p[i] != null) {
                System.out.println(p[i].getName() + "，" + p[i].getFeature() + "，" + p[i].getAge());
            }
        }
    }
}
