package me.youzipi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by youzipi on 17/9/24 下午7:18
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        list.add("12");
        System.out.println(list);
        for (String s : list) {
            System.out.println(1);
            System.out.println(s);
        }
        List<String> list2 = new ArrayList<>(10);
        Collections.copy(list2,list);
        System.out.println(list2);
    }
}
