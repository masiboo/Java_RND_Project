package com.ma.home;

public class App
{
    public static void main( String[] args )
    {
        int total = 0;
        for (int i=1; i<1000; ++i) {
            if (i%3 == 0 || i%5 == 0) {
                total += i;
            }
        };
        System.out.println("The multiples of 3 or 5 up to 1000 are: "+total);
    }
}
