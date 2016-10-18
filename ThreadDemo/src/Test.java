/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-16
 */
public class Test {
    public static void main(String[] args) {
        MyThread th = new MyThread();
        MyThread2 r = new MyThread2();
        MyThread th3 = new MyThread();
        Thread th2 = new Thread(r);
        th.start();
        th2.start();
        th3.start();
        //th.run();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
