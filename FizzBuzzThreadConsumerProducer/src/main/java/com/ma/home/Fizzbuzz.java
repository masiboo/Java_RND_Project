package com.ma.home;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Fizzbuzz {

    public static AtomicInteger counter = new AtomicInteger(0);
    public static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    public static volatile boolean isStop = false;

    public static void main(String[] args) {
        Thread th1 = new Thread(new Producer());
        Thread th2 = new Thread(new Producer());

        Thread th4 = new Thread(new Consumer());

        th1.start();
        th2.start();
        th4.start();
    }

    public static class Producer implements Runnable {

        @Override
        public void run() {
            while (true) {
                Integer counterValue = counter.incrementAndGet();
                final int MAX = 100;
                if (counterValue <= MAX) {
                    queue.add(counterValue);
                } else {
                    isStop = true;
                    break;
                }
            }
        }
    }

    public static class Consumer implements Runnable {

        @Override
        public void run() {
            while (true) {
                Integer counterValue = queue.poll();
                if (counterValue == null) {
                    if (isStop) {
                        break;
                    }
                    continue;
                }
                fizzBuzz(counterValue);
            }
        }
        private void fizzBuzz(Integer value) {
            if (value % (3*5) == 0) {
                System.out.println("FizzBuzz:" + value);
            } else if (value % 3 == 0) {
                System.out.println("Fizz:" + value);
            } else if (value % 5 == 0) {
                System.out.println("Buzz:" + value);
            } else {
                System.out.println(value);
            }
        }
    }

}