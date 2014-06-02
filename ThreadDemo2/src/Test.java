/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-16
 */
public class Test  {
    public static void main(String[] args) {
        Thread th1 = new MyThread();
        Thread th2 = new MyThread("MyThread");
        th1.start();
        th2.start();
    }
}
