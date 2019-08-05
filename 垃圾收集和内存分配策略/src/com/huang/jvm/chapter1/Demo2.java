package com.huang.jvm.chapter1;

/**
 * @author hsz
 */

public class Demo2 {

    private static final int MB_SIZE = 1024 * 1024;

    /**
     * -Xms200M -Xmx200M -Xmn100M -XX:+PrintGC -XX:+PrintGCDetails -XX:MaxTenuringThreshold=5 -XX:+PrintTenuringDistribution -XX:+UseSerialGC
     */
    public static void main(String[] args) {
        byte[] a1 = new byte[MB_SIZE];
        byte[] a2 = new byte[MB_SIZE * 70];
        for (int i = 0; i < 500; i++) {
            a2 = null;
            a2 = new byte[70 * MB_SIZE];
        }
    }
}
