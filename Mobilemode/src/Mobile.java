/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public abstract class Mobile {
    String brand;//品牌
    String color;

    public void powerOn(){
        System.out.println(this.brand + "手机开机。。。");
    }
    public void powerOff(){
        System.out.println(this.brand + "手机关机。。。");


    }
    public void sendMessage(){
        System.out.println(this.brand + "手机发送短信。。。");

    }
    public void call(){
        System.out.println(this.brand + "手机通话。。。");

    }
}
