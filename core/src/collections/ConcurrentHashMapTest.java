package collections;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

/**
 * Created by youzipi on 18/3/20 上午11:09
 */
public class ConcurrentHashMapTest {


    private static final int tableSizeFor(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void test(final Map<String, String> map) {
        Executor e = newFixedThreadPool(5);
        for (int i = 0; i < 1000; i++) {
            e.execute(new Runnable() {
                @Override
                public void run() {
                    map.put("s", "s");
                }
            });
        }
    }


    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        test(map);


//        System.out.println(ConcurrentHashMapTest.tableSizeFor(63));// 64
//        System.out.println(ConcurrentHashMapTest.tableSizeFor(65));// 128

    }
}
