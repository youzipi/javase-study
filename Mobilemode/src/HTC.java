/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public class HTC extends Mobile implements AI{
    HTC(){
    }
    HTC(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
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
