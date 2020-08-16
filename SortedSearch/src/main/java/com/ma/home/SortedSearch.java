package com.ma.home;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        if(sortedArray == null  || sortedArray.length < 1){
            return 0;
        }
        int elementLessThanFour = 0;
        for(int i=0; i<sortedArray.length-1; ++i){
            if(sortedArray[i] >= lessThan){
                break;
            }
            if(sortedArray[i] < lessThan){
                elementLessThanFour++;
            }
        }
        return elementLessThanFour;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}
