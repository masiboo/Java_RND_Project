package com.ma.home;

public class SubArraySum {

    public static void main(String[] args)
    {
        SubArraySum subArraySum = new SubArraySum();
        int arr[] = {9, 2, 3, 4};
        int sum = 7;
        System.out.println(subArraySum.subArraySum(arr, sum));
    }

    boolean subArraySum(int arr[], int givenSum){
        int currSum = arr[0];
        int start=0;
        int end=0;
        while (end < arr.length)
        {
            if (currSum == givenSum)
            {
                System.out.println("Found given sum "+givenSum +" from index " + start + " to " + end);
                return true;
            }

            if (currSum <= givenSum)
            {
                end++;
                if (end < arr.length)
                    currSum = currSum + arr[end];
            }
            else
            {
                currSum = currSum - arr[start];
                start++;
            }
        }
        System.out.println("No subarray found");
        return false;
    }

}
