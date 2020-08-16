package com.ma.home;

import java.io.File;
import java.io.IOException;
import java.util.EmptyStackException;

public class TryCatchFinally {

    public static void main(String[] args) {
        try3();
        try2();
        Try1();
    }

    public static void try3(){
        int divisor =0;
        int dividend = 11;

        try
        {
            int result=dividend/divisor;
            System.out.println("The result is "+result);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero");
        }
        catch(Exception e)
        {
            System.out.println("An exception occured");
        }
        finally
        {
            System.out.println("We are done!");
        }
    }

    public static void try2(){
        try
        {
            System.out.printf("%d", 1);
            throw(new Exception());
        }
        catch(IOException e)
        {
            System.out.printf("%d", 2);
        }
        catch(EmptyStackException e)
        {
            System.out.printf("%d", 3);
        }
        catch(Exception e)
        {
            System.out.printf("%d", 4);
        }
        finally
        {
            System.out.printf("%d", 5);
        }
    }

    public static void Try1(){
        try {
            File file = new File("/tmp/");
            // If we exit by system.exit finally block wont be executing.
            System.exit(0);
            File.createTempFile("aaa", "bbb", file );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally won't execute if app exit by System.exit(0)");
        }

    }


}
