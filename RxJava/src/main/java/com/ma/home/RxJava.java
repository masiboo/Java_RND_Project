package com.ma.home;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;


/**
 * Hello world!
 *
 */
public class RxJava
{
    public static void main( String[] args )
    {
        Flowable.just("Hello world").subscribe(System.out::println);

        Flowable.just("Hello world22").subscribe(new Consumer<String>() {
           // @Override
            public void accept(String t) throws Exception {
                System.out.println(t);
            }
        });

        Flowable.just("Hello world222333")
                .subscribe(new Consumer<String>() {
                    @Override public void accept(String s) {
                        System.out.println(s);
                    }
                });

    }
}
