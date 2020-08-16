package com.ma.home;

import java.util.function.ToDoubleBiFunction;

/**
 * Hello world!
 *
 */
public class LamdaDemo
{
    public interface MyRunnable<T, U> {
        int myRun(T str, U val);
    }

    public static int myLamda(MyRunnable runnable){
        return   runnable.myRun("sss", "a");
    }

    public static double myLamda2(ToDoubleBiFunction toDoubleBiFunction){
        return   toDoubleBiFunction.applyAsDouble ("sss", 10);
    }

    public static void testLamda(){
        MyRunnable<String, Integer> test =  (x, y) -> {
            System.out.printf("x: "+x);
            return y;
        };
        double xx = test.myRun("str", 10);

        Integer xx2 = 33;
        int test2 =  myLamda((x, zz) -> {
            System.out.printf("x: "+x);
            Integer integer = 10;
            return integer;
        });
    }

    public static void main( String[] args )
    {
        testLamda();
    }
}
