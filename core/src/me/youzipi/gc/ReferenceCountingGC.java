package me.youzipi.gc;


/**
 * Created by youzipi on 16/10/24.
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC a = new ReferenceCountingGC();
        ReferenceCountingGC b = new ReferenceCountingGC();
        a.instance = b;
        b.instance = a;
        a = null;
        b = null;
        System.out.println("boom");

        System.gc();
    }

}
