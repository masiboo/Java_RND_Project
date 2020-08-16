package com.ma.home;

public class StringStringBuilder {

    public static void main(String args[])
    {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        sb2.append("e");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

        short s = 0;
        int x = 07;
        int y = 06;
        int z = 112345;

        s += z;
        System.out.println("" + x + y + s);
    }

}
