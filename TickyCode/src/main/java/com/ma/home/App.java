package com.ma.home;

import java.io.CharArrayReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Hello world!
 *
 */

class Super {
    public int index = 1;
}

public class App extends Super {

    public App(int index) {
        this.index = index;
    }

    public static void main( String[] args )
    {
       // App myApp = new App(10);
      //  System.out.println(myApp.index);

      //  numberCompare();

     //   printchar();

//        bigIntegerCompare();

      // compareString();

    //   theDoubleProblem1();

     //  IntegerCompare();

     //compareStringTest();
   // TrickyCode2();
   // TrickyCode3();
    TrickyCode4();
    }

    /**
     * Answer: b)num1 == num2
     *                   num3 != num4
     * Reason: We always thought that whenever two object references
     * are compared using “==”, it always evaluates to “false”.
     * But here Integer caching changes the results.
     * Integer class has a caching range of -128 to 127.
     * Whenever a number is between this range and autoboxing is used,
     * it assigns the same reference. That’s why for value 100, both num1 and num2
     * will have the same reference, but for the value 500 (not in the range of -128 to 127),
     * num3 and num4 will have different reference.
     */
    private static void numberCompare(){

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }

    /**
     * Answer: b) Something else (Other than simple concatenation)
     * Reason: “java” would be printed if String literals (in double quotes) are used,
     * but in the question since character literals has been used,
     * these won’t be concatenated. Therefore After execution of the program,
     * an addition of each equivalent ASCII(Unicode) value of the character
     * will be obtained. Hence the output is 106 + 97 + 118 + 97 = 418
     */
    static void printchar(){
        System.out.println('j' + 'a' + 'v' + 'a');
    }

    static void bigIntegerCompare(){
        // Creating 2 BigInteger objects
        BigInteger b1, b2;

        b1 = new BigInteger("321456");
        b2 = new BigInteger("321456");

        // apply compareTo() method
        int comparevalue = b1.compareTo(b2);

        // print result
        if (comparevalue == 0) {

            System.out.println("BigInteger1 "
                    + b1 + " and BigInteger2 "
                    + b2 + " are equal");
        }
        else if (comparevalue == 1) {

            System.out.println("BigInteger1 " + b1 + " is greater than BigInteger2 " + b2);
        }
        else {

            System.out.println("BigInteger1 " + b1 + " is lesser than BigInteger2 " + b2);
        }

        b1 = new BigInteger("654321");
        b2 = new BigInteger("321456");

        // apply compareTo() method
        comparevalue = b1.compareTo(b2);

        // print result
        if (comparevalue == 0) {

            System.out.println("BigInteger1 " + b1 + " and BigInteger2 " + b2 + " are equal");
        }
        else if (comparevalue == 1) {

            System.out.println("BigInteger1 " + b1 + " is greater than BigInteger2 " + b2);
        }
        else {

            System.out.println("BigInteger1 " + b1 + " is lesser than BigInteger2 " + b2);
        }

        b1 = new BigInteger("321456");
        b2 = new BigInteger("564321");

        // apply compareTo() method
        comparevalue = b1.compareTo(b2);

        // print result
        if (comparevalue == 0) {

            System.out.println("BigInteger1 " + b1 +
                    "and BigInteger2 " + b2 + " are equal");
        }
        else if (comparevalue == 1) {

            System.out.println("BigInteger1 " + b1 + " is greater than BigInteger2 " + b2);
        }
        else {

            System.out.println("BigInteger1 " + b1 + " is lesser than BigInteger2 " + b2);
        }
    }

    private static void compareString(){
        String string1 = new String("Geeksforgeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");
        String string5 = new String("geeks");
        String str1 = "abc";
        String str2 = new String(str1);

        // Comparing for String 1 != String 2
        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + string1.equals(string2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4
                + " : " + string3.equals(string4));

        // Comparing for String 4 != String 5
        System.out.println("Comparing " + string4 + " and " + string5
                + " : " + string4.equals(string5));

        // Comparing for String 1 != String 4
        System.out.println("Comparing " + string1 + " and " + string4
                + " : " + string1.equals(string4));

        // Comparing for str1 != str2
        System.out.println("Comparing " + str1 + " and " + str2
                + " : " + str1.equals(str2));

        // Comparing for str1 == str2
        System.out.println("Comparing " + str1 + " and " + str2
                + " : " + str1 == str2);
    }

    static void theDoubleProblem1() {
        double d1 = 0.3;
        double d2 = 0.2;
        System.out.println("Double:\t 0,3 - 0,2 = " + (d1 - d2));

        float f1 = 0.3f;
        float f2 = 0.2f;
        System.out.println("Float:\t 0,3 - 0,2 = " + (f1 - f2));

        BigDecimal bd1 = new BigDecimal("0.3");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println("BigDec:\t 0,3 - 0,2 = " + (bd1.subtract(bd2)));

        BigInteger bi1 = new BigInteger("3");
        BigInteger bi2 = new BigInteger("2");
        System.out.println("BigInteger:\t 3 - 2 = " + (bi1.subtract(bi2)));
    }

    static void IntegerCompare(){
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1==num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3 == num4){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
        /*
        We always thought that whenever two object references are
        compared using “==”, it always evaluates to “false”.
        But here Integer caching changes the results.Integer class has a
        caching range of -128 to 127. Whenever a number is between this range
        and autoboxing is used, it assigns the same reference.
        That’s why for value 100, both num1 and num2 will have the same reference,
        but for the value 500 (not in the range of -128 to 127), num3 and num4
        will have different reference.
         */
    }

    static void compareStringTest(){
        String a = "GeeksforGeeks";
        String b = new String(a);
        int value = 0;
        value = (a==b) ? 1:2;
        if(value == 1)
        {
            System.out.println("GeeksforGeeks");
        }
        else if(value == 2)
        {
            System.out.println("Geeks for Geeks");
        }
        else
        {
            System.out.println("GFG");
        }
    }

    static void TrickyCode(){
        String obj = "abcdef";
        int length = obj.length();
        char[] c = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader io_1 = new CharArrayReader(c);
        CharArrayReader io_2 = new CharArrayReader(c, 0, 3);
        int i;
        try {
            while ((i = io_2.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void TrickyCode2(){
        String obj = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader io_1 = new CharArrayReader(c);
        CharArrayReader io_2 = new CharArrayReader(c, 1, 4);
        int i, j;
        try {
            while ((i = io_1.read()) == (j = io_2.read())) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void TrickyCode3(){
        int[] x = { 1, 2, 3, 4 };
        int[] y = x;

        x = new int[2];

        for (int i = 0; i < x.length; i++)
            System.out.print(y[i] + " ");
    }


    static void TrickyCode4(){
        int value = 3, sum = 6 + -- value;

        int data = --value + ++value / sum++ * value++ + ++sum  % value--;
        System.out.println(data);
    }

}
