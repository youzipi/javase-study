package me.youzipi.collections;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by youzipi on 16/11/24.
 */
public class Test {

    public static void testQueue() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        for (Integer i : queue) {
            System.out.println(i);
        }
    }

    public static void testHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 12);
        map.put("b", 24);
        map.put("b", 36);
    }

    public static void main(String[] args) {
        Test.testHashMap();

    }
}
