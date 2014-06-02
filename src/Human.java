/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-3-6
 */
public class Human {
    public String name;
    String gender;
    int age;
    static int number=0;
    Human(){
        System.out.println("世界上新诞生了一个人...");
        number++;
        this.name = "无名";
        this.gender = "男";
        this.age = 1;
        this.introduce();
    }
    Human(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;

    }
    public void introduce(){
        System.out.println("我是"+this.name+",性别"+this.gender+",年龄"+this.age+"。");
    }



    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.introduce();
        System.out.println(number);
        System.out.println(number);
        System.out.println(Human.number);
        System.out.println(h1 == h2);
        for(int i=0;i < args.length;i++){
            System.out.println(args[i]);
        }
        System.out.println(args.length);
    }

}