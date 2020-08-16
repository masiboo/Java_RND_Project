package com.ma.home;

import java.util.*;

/**
 * Hello world!
 */
public class FindMode {
    public static int find_mode(int number[], int size) {
        HashMap<Integer, Integer> mode = new HashMap<>();
        Vector<Integer> allModes = new Vector<>();
        // Creating map of occurances of each number
        for (int i = 0; i < size; ++i) {
            int n = 1;
            if (mode.containsKey(number[i])) {
                n = mode.get(number[i]) + 1;
            }
            mode.put(number[i], n);
        }

        Map.Entry<Integer, Integer> temp = mode.entrySet().stream().
                max((e1, e2) -> {
                    return Integer.compare(e1.getValue(), e2.getValue());
                }).get();

        for (Map.Entry<Integer, Integer> entry : mode.entrySet()) {
            if (temp.getValue() == entry.getValue()) {
                allModes.addElement(entry.getKey());
            }
        }
        mode.values();

        return temp.getKey();
    }

    public static void main(String[] args) {

        int[] intArray = {1,1,1,1,1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9,9,9,9,9, 10};
        System.out.println(find_mode(intArray, intArray.length));
    }
}
