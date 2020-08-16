package com.ma.home;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class findMedian
{
    public static double find_median(int[] numArray){
        Arrays.sort(numArray);
        double median;
        if (numArray.length % 2 == 0)
            median = ((double)numArray[numArray.length/2] + (double)numArray[numArray.length/2 - 1])/2;
        else
            median = (double) numArray[numArray.length/2];
        return median;
    }

    public static void main( String[] args )
    {
       int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(find_median(intArray));
    }
}
