package com.ma.home;

public class RunTest extends Thread {

    public void run()
    {
        System.out.println("Test ");
        System.out.println("stop");
    }
    public static void main(String[] args) throws InterruptedException {
        RunTest test = new RunTest();
        test.run();
        test.start();
        test.join();
        System.out.println("main stop");
    }
}
