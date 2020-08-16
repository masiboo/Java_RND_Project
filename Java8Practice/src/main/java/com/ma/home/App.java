package com.ma.home;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }

    static void testU(){
        System.out.println("Test you");
    }
}

interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}

public class App implements TestInterface1, TestInterface2
{
    private static List<Student> studentList = new ArrayList<>();

    public static void main( String[] args )
    {
        fillList();
        studentList.forEach(student -> System.out.println(student));
        List<Student> studentListUpdated = studentList.stream().map(App::modifyStudent).collect(Collectors.toList());
        studentListUpdated.forEach(student -> System.out.println(student));

        List<String> strList2 = new ArrayList<>();
/*        studentList.forEach( s -> {
            strList2.add(s.getName());
        });*/
        List<String> strList = new ArrayList<>();
      /*  strList = */
        List<Student> strList3 =   studentList.stream().collect(Collectors.toList());
               // .map(s -> strList.add(s.getName()));


                //.collect(strList);
        strList.forEach(name -> System.out.println("only student name: "+name));

        App app  = new App();
        app.show();
        TestInterface1.testU();
        testU();
    }

    public static void fillList(){
        for(int i=0; i<5; i++){
            Student student = new Student();
            student.setName("Mahi "+i);
            student.setAge(i);
            student.setRoll(i);
            student.setSection("Section "+i);
            studentList.add(student);
        }


    }

    public static Student modifyStudent(Student student){
        student.setName(student.getName()+"upated");
        return student;
    }

    public void show() {

        TestInterface1.super.show();

    }

    static void testU(){
        System.out.println("Test you from App");
    }
}
