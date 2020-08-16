package com.ma.home;

public class StaticTest {
    private static int value = 20;
    public static int s = 15;
    public static int temp = 10;

    public static class Nested
    {
        private void display()
        {
            System.out.println(temp + s + value);
        }
    }

    public static void main(String args[])
    {
        StaticTest.Nested inner = new StaticTest.Nested();
        inner.display();
    }

    static float test() {
       // static float x = 0.0f; // static not allowed as local
       // return ++x;
        return 0;
    }
}
