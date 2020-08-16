package com.ma.home;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionApiTest {

    public static void main(String[] args) {
        //mapSorting();
       // mapIterate();
        mapRetrieve();
    }

    public static void mapSorting(){
        Map<String, String> map = new HashMap<>();
        map.put("C", "C");
        map.put("B", "A");
        map.put("Z", "B");
        List<Map.Entry<String, String>> sortedByKey = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        System.out.println("Sort by key");
        sortedByKey.forEach(System.out::println);

        List<Map.Entry<String, String>> sortedByKey2 = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println("Sort by value");
        sortedByKey2.forEach(System.out::println);
    }

    public static void mapIterate(){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        map.put("B", "b");
        map.put("Z", "z");
        map.forEach((k, v) ->
                System.out.println("Key : " + k + " Value : " + v));

    }

    public static void mapRetrieve(){
        Map<String, String> map = new HashMap<>();
        map.put("C", "c");
        String val = map.getOrDefault("B", null);
        System.out.println(val);
        val = map.getOrDefault("C", null);
        System.out.println(val);

        Map<String, String> map2 = new HashMap<>();
        map2.put("C", "c");
        map2.put("B", "b");
        map2.put("A", "a");
        map2.put("Z", "z");
        map2.replaceAll((k, v) -> "x");
        map2.forEach((k,v) -> System.out.println("key: "+k+" val: "+v));
        map2.replace("C", "x", "ccc");
        System.out.println("After replace C");
        map2.forEach((k,v) -> System.out.println("key: "+k+" val: "+v));
        map2.putIfAbsent("B", "new val");
        System.out.println("After replace C");
        map2.forEach((k,v) -> System.out.println("key: "+k+" val: "+v));
        map2.computeIfAbsent("X", v -> v.concat(" add val "));
        System.out.println("After B compute");
        map2.forEach((k,v) -> System.out.println("key: "+k+" val: "+v));

        map2.merge("Z", "NEW", (v1, v2) -> v1 + v2);
        System.out.println(map.get("Z"));
    }
}
