package com.huang.jvm.chapter1;

public class Main2 {

    private static final int MB_SIZE = 1024 * 1024;

    /**
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGC -XX:+PrintGCDetails -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
     */
    public static void main(String[] args) {
        byte[] a1 = new byte[3 * MB_SIZE];
    }
}
