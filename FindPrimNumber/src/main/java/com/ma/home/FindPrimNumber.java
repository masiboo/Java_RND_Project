package com.ma.home;

import java.util.Vector;

/**
 * Hello world!
 */
public class FindPrimNumber {
    public static Vector<Integer> generatePrimeNumber(int low, int high) {
        Vector<Integer> result = new Vector<>();

        while (low < high) {
            boolean isPrime = true;
            int half = low / 2;

            for (int i = 2; i <= half; i++) {
                if (low % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && low > 1) {
                result.add(new Integer(low));
            }
            ++low;
        }
        return result;
    }

    public static boolean isPrime(int number) {
        /*if(number == 1){
            return false;
        }*/
        if (number % 2 == 0 && number != 2 || number == 1 ){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Vector<Integer> primeNumber = generatePrimeNumber(0, 100);
        primeNumber.forEach(System.out::println);
        System.out.println(isPrime(1));
    }
}
