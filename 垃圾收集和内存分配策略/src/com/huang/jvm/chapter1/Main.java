package com.huang.jvm.chapter1;

public class Main {

    private static final int MB_SIZE = 1024 * 1024;

    /**
     * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGC -XX:+PrintGCDetails -XX:+UseSerialGC
     */
    public static void main(String[] args) {
        byte[] a1 = new byte[2 * MB_SIZE];
        byte[] a2 = new byte[2 * MB_SIZE];
        byte[] a3 = new byte[2 * MB_SIZE];
        a1 = null;
        a2 = null;
        a3 = null;
        byte[] a4 = new byte[5 * MB_SIZE];
    }
}

/*运行结果：
[GC (Allocation Failure) [DefNew: 8135K->618K(9216K), 0.0009852 secs] 8135K->618K(19456K), 0.0010119 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
Heap
 def new generation   total 9216K, used 5904K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
  eden space 8192K,  64% used [0x00000000fec00000, 0x00000000ff129790, 0x00000000ff400000)
  from space 1024K,  60% used [0x00000000ff500000, 0x00000000ff59a948, 0x00000000ff600000)
  to   space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
 tenured generation   total 10240K, used 0K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
   the space 10240K,   0% used [0x00000000ff600000, 0x00000000ff600000, 0x00000000ff600200, 0x0000000100000000)
 Metaspace       used 3443K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 376K, capacity 388K, committed 512K, reserved 1048576K
 */
