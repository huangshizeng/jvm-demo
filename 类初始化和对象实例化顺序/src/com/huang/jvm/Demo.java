package com.huang.jvm;

/**
 * @author hsz
 */

public class Demo {

    int a = print(3);
    public Demo() {
        System.out.println("构造方法");
    }
    {
        System.out.println("非静态块");
    }
    int b = print(4);
    public int print(int value) {
        System.out.println("实例" + value);
        return value;
    }

    static int i = printStatic(1);
    static {
        System.out.println("静态块");
    }
    static int j = printStatic(2);
    public static int printStatic(int value) {
        System.out.println("静态" + value);
        return value;
    }
    public static void main(String[] args) {
        new Demo();
    }
}
