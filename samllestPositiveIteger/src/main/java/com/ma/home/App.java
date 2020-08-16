package com.ma.home;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] input = new int[]{1, 3, 6, 4, 1, 2};
        System.out.println(solution( input));
    }

    static public int solution(int[] A) {
        int N = A.length;
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
