package com.ma.home;
import java.io.*;

public class InnerClassTest
{
    public void display() throws IOException
    {
        System.out.println("InnerClassTest");
    }

}

class Derived2 extends InnerClassTest
{
    public void display() throws IOException
    {
        System.out.println("Derived");
    }
    public static void main(String[] args) throws IOException
    {
        Derived2 object = new Derived2();
        InnerClassTest parent = new Derived2();
        InnerClassTest parent2 = new InnerClassTest();
        parent2.display();
        parent.display();
        object.display();
    }
}
