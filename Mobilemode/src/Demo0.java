/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-2
 */
public class Demo0 {
    public static void main(String[] args) {

        Samsung sam = new Samsung("Galaxy","white");
        Apple app = new Apple("5S","white");
        HTC htc = new HTC("belly","black");

        sam.powerOn();
        sam.internet();
        sam.powerOff();
        System.out.println("======================");
        app.powerOn();
        app.internet();
        app.powerOff();
    }
}
