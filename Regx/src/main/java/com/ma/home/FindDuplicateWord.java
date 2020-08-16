package com.ma.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDuplicateWord {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b(\\w+)\\b(?=.*\\b(\\1)\\b)", Pattern.DOTALL);

        String s = "I want to eat apple. apple is a fruit.\r\n I really want fruit.";
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println("at: " + m.start(1) + " " + m.group(1));
            System.out.println("    " + m.start(2) + " " + m.group(2));
        }
    }
}
