package com.huang.jvm.chapter1;

/**
 * @author hsz
 */

public class Demo2 {

    private static final int MB_SIZE = 1024 * 1024;

    /**
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGC -XX:+PrintGCDetails -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution -XX:+UseSerialGC
     */
    public static void main(String[] args) {
        byte[] a1 = new byte[MB_SIZE / 2];
        byte[] a2 = new byte[MB_SIZE / 2];
        byte[] a3 = new byte[MB_SIZE / 2];
        byte[] a4 = new byte[MB_SIZE / 2];
        byte[] a5 = new byte[MB_SIZE / 2];
        byte[] a6 = new byte[MB_SIZE / 2];
        byte[] a7 = new byte[MB_SIZE / 2];
        byte[] a8 = new byte[MB_SIZE / 2];
        byte[] a9 = new byte[MB_SIZE / 2];
        byte[] a10 = new byte[MB_SIZE / 2];
        byte[] a11 = new byte[MB_SIZE / 2];
        byte[] a12 = new byte[MB_SIZE / 2];
        byte[] a13 = new byte[MB_SIZE / 2];
//        byte[] a14 = new byte[MB_SIZE / 2];
//        byte[] a15 = new byte[MB_SIZE / 2];
//        byte[] a16 = new byte[MB_SIZE / 2];
//        byte[] a17 = new byte[MB_SIZE / 2];
//        byte[] a18 = new byte[MB_SIZE / 2];
//        byte[] a19 = new byte[4 * MB_SIZE];
//        byte[] a20 = new byte[4 * MB_SIZE];
//        a3 = null;
//        a3 = new byte[4 * MB_SIZE];
    }
}
