package com.ma.home;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * Hello world!
 */

class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters for name and age attributes go here
    //overridden equals() and hashcode() go here
    public String toString() {
        return "Employee Name:" + this.name
                + "  Age:" + this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

public class StreamDemoApp {
    static List<Employee> employeeList = Arrays.asList(
            new Employee("Tom Jones", 45),
            new Employee("Harry Major", 25),
            new Employee("Ethan Hardy", 65),
            new Employee("Nancy Smith", 22),
            new Employee("Deborah Sprightly", 29),
            new Employee("Billy Kid", 22),
            new Employee("George King", 44),
            new Employee("Annie Barrey", 19));

   static int[] data = {1,2,3,4,5,6,7,8,9,10};
    static List<String> strList = Arrays.asList(
            new String("Tom Jones"),
            new String("Harry Major"),
            new String("Ethan Hardy"),
            new String("Tom Jones"),
            new String("Deborah Sprightly"),
            new String("Billy Kid"),
            new String("George King"),
            new String("Annie Barrey"));

    public static void collectItemInList() {
        List<Employee> empList = new ArrayList<>();
        employeeList.stream().
                filter(emp -> emp.getAge() > 40).
                forEach(employee1 -> {
                    empList.add(employee1);
                });

        List<Employee> empList2 = employeeList.stream().
                filter(emp -> emp.getAge() > 40).collect(Collectors.toList());


        for (Employee e : empList2) {
            System.out.println(e);
        }
    }

    public static void testStrList(){

    }

    private static List<Employee> appendTest(List<Employee> inputList){
        return inputList.stream().map(element -> {
            element.setName("Mr. "+element.getName());
            return element;
        }).collect(Collectors.toList());
    }

    private static List<Employee> makeNewListByStreamMap(List<Employee> inputList){
        return inputList.stream().map( employee -> {
            employee.setName(employee.getName()+" is an Engineer");
            return employee;
        }).collect(Collectors.toList());
    }

    public static int getMaxItem(){
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

        int ret = Arrays.stream(what).max((e1, e2) ->  Integer.compare(e1, e2)).get();
        return ret;
    }

    public static int getMinItem(){
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );

        int ret = Arrays.stream(what).min((e1, e2) ->  Integer.compare(e1, e2)).get();
        return ret;
    }

    public static <T> T getAvarageItem(){
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        Double arverage = Arrays.stream(what).collect(Collectors.averagingInt(Integer::intValue));
        return (T)arverage;
    }

    public static void testReduce(){
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
       Long ret =  Arrays.stream(what).map(Integer::intValue).count();//reduce(0, (a , b) -> a+b);

    }

    public static void main(String[] args) {
        collectItemInList();
        getMaxItem();
        System.out.println("min: " +getMinItem());
        System.out.println("Avag: "+getAvarageItem());
        testReduce();

        List<Employee> outputList = appendTest(employeeList);
        outputList.forEach(employee -> System.out.println(employee.getName()));
        System.out.println("===== End ====");
        outputList = makeNewListByStreamMap(employeeList);
        outputList.forEach(employee -> System.out.println(employee.getName()));
    }
}
