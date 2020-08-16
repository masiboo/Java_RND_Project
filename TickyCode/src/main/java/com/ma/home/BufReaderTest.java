package com.ma.home;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufReaderTest {
    static int test;

    static boolean finalTest(){
        test++;
        return true;
    }

    static boolean finalTest2(){
        test++;
        return true;
    }

    public static void main(String args[]) throws IOException {

        test=0;
        if ((finalTest() | finalTest()) && finalTest2()){
            test++;
        }
        System.out.println(test);

        // get two double numbers
        double x = 125.9;
        double y = 0.4873;
        double z = 199.5;

        // call ceal for these these numbers
        System.out.println("Math.ceil(" + x + ")=" + Math.ceil(x));
        System.out.println("Math.ceil(" + y + ")=" + Math.ceil(y));
        System.out.println("Math.ceil(" + z + ")=" + Math.ceil(z));
        System.out.println("Math.ceil(-0.65)=" + Math.ceil(-0.65));

        String initial = "ABCDEFG", after = "";
        after = initial = initial.replace('A', 'Z');
        System.out.println(initial + ", " + after);

        String str = (String) returnStringAsArray()[-1 + 1 * 2];
        System.out.println(str);

        int[] table = { 1, 2, 3, 4, 5 };
        table[1] = (table[2 * 1] == 2 - args.length) ? table[3] : 99;
        System.out.println(table[1]);


        try {
            args[0] = "0";
            return;
        } catch (Exception e) {
            System.out.print("Exception");
        } finally {
            System.out.print("Final");
        }

        File sys = new File("/tmp");
        System.out.println(sys.canWrite());
        System.out.println(" " + sys.canRead());

        File sys2 = new File("/MVC/system");
        System.out.print(sys2.getParent());
        System.out.print(" " + sys2.isFile());

        char bit;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        do {
            bit = (char) obj.read();
            System.out.print(bit);
        } while (bit != '\'');
       // } while (bit != 'q');


    }

    public static Object[] returnStringAsArray() {
        return new String[] { "Java", "Quiz", "Quiz234" };
    }
}
