/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-16
 */
public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println(Thread.currentThread().getId()+":"+i);
        }
    }
}
