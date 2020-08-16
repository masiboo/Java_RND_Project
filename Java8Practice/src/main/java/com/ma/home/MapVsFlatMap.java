package com.ma.home;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(list);
        // This snippet prints a list of lists [[a], [b]].

        List<String> strList = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(strList);
        // The result of such a snippet will be flattened to [a, b].
        // So flatMap flatten List of list in single list. 

    }
}
