package me.youzipi.collections;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by youzipi on 18/4/3 下午4:48
 */

public class MyThread implements Runnable {
    ConcurrentHashMap<String, String> map;

    public MyThread() {
    }

    public MyThread(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        map.put("ssd", "dd");
        map.put("ssd", "dd");
    }
}