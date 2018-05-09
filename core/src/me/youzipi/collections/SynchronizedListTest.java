package me.youzipi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by youzipi on 18/3/21 下午5:03
 */
public class SynchronizedListTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        List<Object> synchronizedList = Collections.synchronizedList(list);
        Object o = synchronizedList.get(0);
    }
}
