package me.youzipi.collections;

import java.util.HashSet;

/**
 * Created by youzipi on 18/4/8 下午3:31
 */
public class SetTest {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set.addAll(set2);
    }
}
