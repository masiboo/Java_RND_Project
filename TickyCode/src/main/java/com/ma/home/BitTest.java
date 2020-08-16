package com.ma.home;

public class BitTest {
    public static void main(String[] args) {
        int bits;

        bits = -3 >> 1;
        System.out.println("bit1: "+bits);
        bits = bits >>> 2;
        System.out.println("bit2: "+bits);
        bits = bits << 1;
        System.out.println(bits);
    }
}
