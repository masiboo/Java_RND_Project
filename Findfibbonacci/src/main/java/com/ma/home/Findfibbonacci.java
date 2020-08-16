package com.ma.home;

import java.util.*;

/**
 * Hello world!
 */
public class Findfibbonacci {
    //private static Vector<Integer> vector = new Vector<>();
    private static List<Integer> fibList = new ArrayList<>();

    public static int NthFibbonacci(int input) {
        if (input == 0) {
            return 0;
        }
        if (input == 1 || input == 2) {
            fibList.add(1);
            // return vector.get(vector.size()-1);
            return 1;
        }
        if (fibList.contains(input)) {
            return input;
        }
        int retVal = NthFibbonacci(input - 1) + NthFibbonacci(input - 2);
        fibList.add(retVal);
        return fibList.get(fibList.size() - 1);
    }

    public static int fibX(int n) {
        if (n <= 1)
            return n;
        return fibX(n - 1) + fibX(n - 2);
    }

    public static List<Integer> generateFibbonacci(int startPoint, int terms) {
        //Vector<Integer> v = new Vector<>();
        List<Integer> fibList = new ArrayList<>();
        fibList.add(startPoint);
        fibList.add(1);

        for (int i = 2; i < terms; i++) {
            fibList.add(fibList.get(i - 1) + fibList.get(i - 2));
        }
        return fibList;
    }

    static int MAX = 1000;
    static int[] f = new int[MAX];

    public static int fib2(int n) {
        // Base cases
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return (f[n] = 1);

        // If fib(n) is already computed
        if (f[n] != 0)
            return f[n];

        f[n] = fib2(n - 1) + fib2(n - 2);
        return f[n];
    }

    public static int sum4millionEvenFib() {
        int finb1 = 0, fib2 = 0, fib3 = 1;
        int max = 4000000;
        int sum = 0;
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= max; i++)
        {
            finb1 = fib2;
            fib2 = fib3;
            fib3 = finb1 + fib2;
            System.out.print(finb1+" ");
            if(fib3%2 == 0){
                sum += fib3;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
      //  System.out.println("feb: " + fibX(10));
      //  System.out.println("feb: " + fib2(6));
        System.out.println(sum4millionEvenFib());
    }
}
