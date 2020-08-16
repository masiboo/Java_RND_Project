package com.ma.home;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class FizzBuzz {
    public static void main( String[] args )
    {
        int value = -1;
        while (value != 0 ){
            System.out.printf("Please enter a interger number or enter 0 to exist: ");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            try {
                value = Integer.parseInt(input);
                processInput(value);
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Not at valid integer number. Try again!");
            }
        }
    }

    static public void processInput(int value){
        if (value % (3*5) == 0) {
            Printer printer = new Printer("FizzBuzz:" + value);
            Thread thread = new Thread(printer);
            thread.start();
        } else if (value % 3 == 0) {
            Printer printer = new Printer("Fizz:" + value);
            Thread thread = new Thread(printer);
            thread.start();
        } else if (value % 5 == 0) {
            Printer printer = new Printer("Buzz:" + value);
            Thread thread = new Thread(printer);
            thread.start();
        } else {
            System.out.println(value);
        }
    }

    static class Printer implements Runnable{
        private String msg;

        Printer(String msg){
            this.msg = msg;
        }
        @Override
        public void run() {
            System.out.println("Thread id: "+Thread.currentThread().getId());
            System.out.printf(msg);
        }
    }

    static class FizzBuzzPrinter implements Callable<Integer> {
        private int printNum;

        public FizzBuzzPrinter (int printNum){
            this.printNum = printNum;
        }

        @Override
        public Integer call() throws Exception {
            return null;
        }
    }
}
