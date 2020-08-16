package com.ma.home;

/**
 * Hello world!
 *
 */
public class ForgJump
{


    public static int numberOfCombinations(int distance) {
        if (distance == 1) {
            return 1; //step
        } else if (distance == 2) {
            return 2; // (step + step) or jump
        } else {
            return numberOfCombinations(distance - 1) + numberOfCombinations(distance - 2);
            // we jumped or stepped into the current field
        }

    }

    public static int NumberOfWays(int n)
    {

        int firstnumber = 0, secondnumber = 1, result = 0;

        if (n == 1) return 1;
        if (n == 2) return 2;


        for (int i = 2; i <= n +1; i++)
        {
            result = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = result;
        }

        return result;

    }

    public static void main( String[] args )
    {
        //System.out.printf(""+numberOfCombinations(4));
        System.out.println(""+(NumberOfWays(3)));
        System.out.println(""+(NumberOfWays(4)));
        System.out.println(""+(NumberOfWays(5)));
        System.out.println(""+(NumberOfWays(8)));

    }
}
