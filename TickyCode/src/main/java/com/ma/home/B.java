package com.ma.home;

class A
{
    public A(String s) {
        System.out.print("A arg ctor");
    }

    public A(){
        System.out.print("default A ");
    }
}

public class B extends A
{
    public B(String s) {
        System.out.print("B");
    }
    public static void main(String[] args)
    {
        new B("C");
        System.out.println(" ");
    }
}

