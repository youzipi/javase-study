/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public class Samsung extends Mobile implements AI{

    Samsung(){
    }
    Samsung(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void internet() {
        System.out.println(this.brand + "手机上网。。。");
    }

    @Override
    public void office() {
        System.out.println(this.brand + "手机办公。。。");
    }

    @Override
    public void music() {
        System.out.println(this.brand + "手机播放音乐。。。");
    }

    @Override
    public void camera() {
        System.out.println(this.brand + "手机拍照。。。");
    }

}
