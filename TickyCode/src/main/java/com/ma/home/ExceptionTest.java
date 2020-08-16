package com.ma.home;

public class ExceptionTest {
    public ExceptionTest()
    {
        System.out.println("GeeksforGeeks");
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("inside ctor");
        }
    }

      void testMethod() {
          try {
              throw new Exception();
          } catch (Exception e) {
              System.out.println("GFG");
          }
      }

    public static void main(String[] args)
    {
        ExceptionTest test = new ExceptionTest();
        test.testMethod();
    }
}
