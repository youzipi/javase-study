package me.youzipi.concurrent;

/**
 * 可能的执行顺序：
 * main -> m2 -> m1, 则 b := 2000, 然后 b := 1000
 * main -> m2 -> m1, 则 b := 2000, 然后 b := 1000
 * <p>
 * Created by youzipi on 18/2/17 下午7:41
 */
public class TestSync implements Runnable {
    int b = 100;

    synchronized void m1() throws InterruptedException {
        System.out.println("TestSync.m1() start     =");
        b = 1000;
        Thread.sleep(500);
        System.out.println("m1(),b=" + b);

        System.out.println("TestSync.m1() finish    =");
    }

    synchronized void m2() throws InterruptedException {
        System.out.println("TestSync.m2() start     =");
        Thread.sleep(250);
        b = 2000;
        System.out.println("m2(),b=" + b);
        System.out.println("TestSync.m2() finish    =");
    }

    @Override
    public void run() {
        try {
            System.out.println("TestSync.run() start    ==");
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TestSync.run() finish   ==");
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start              ===");
        TestSync test = new TestSync();
        Thread t1 = new Thread(test, "t1");
        /**
         * 这里，t1 和 主线程 是两个独立的线程，就看 CPU 调度，谁先开始执行了。
         * ps: Java 中没有父子线程的概念，每个线程都是独立的
         */
        t1.start(); // t1 线程中 执行 m1
//        Thread.sleep(250);

        test.m2(); // main 线程中 执行 m2
        Thread.sleep(1000);
        System.out.println("main thread b=" + test.b);
        System.out.println("main finish             ===");
    }

}
