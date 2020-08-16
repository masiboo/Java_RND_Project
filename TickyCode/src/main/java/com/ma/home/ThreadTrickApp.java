package com.ma.home;

public class ThreadTrickApp implements Runnable {

    public void run()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%d",3);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(new ThreadTrickApp());
        thread.start();
        System.out.printf("%d",1);
       // thread.join();
        System.out.printf("%d",2);
    }
}
