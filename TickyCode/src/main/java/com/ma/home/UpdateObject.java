package com.ma.home;

public class UpdateObject {

    int i[] = { 0 };

    public static void main(String[] args) {
        int i[] = { 1 };
        i = alter(i);
        System.out.println(i[0]);
    }

    public static int[] alter(int i[]) {
        int j[] = { 2 };
        i = j;
        return i;
    }
}
