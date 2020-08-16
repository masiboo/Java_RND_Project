package com.ma.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestPatternMatcher {
    public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        // in case you would like to ignore case sensitivity,
        // you could use this statement:
        // Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
        // now create a new pattern and matcher to replace whitespace with tabs
        Pattern replace = Pattern.compile("\\s+");
        Matcher matcher2 = replace.matcher(EXAMPLE_TEST);
        System.out.println(matcher2.replaceAll("\t"));

        testSimpleTrue();

        testPhoneNumberTest();
        testSpecificNumber();
    }

    static private void testSimpleTrue() {
        String s = "humbapumpa jim";
        System.out.println("jim or joe in string test");
        System.out.println(s +" "+ (s.matches(".*(jim|joe).*")));
        s = "humbapumpa jom";
        System.out.println(s +" "+ s.matches(".*(jim|joe).*"));
        s = "humbaPumpa joe";
        System.out.println(s +" "+(s.matches(".*(jim|joe).*")));
        s = "humbapumpa joe jim";
        System.out.println(s +" "+s.matches(".*(jim|joe).*"));
    }

    /**
     * Task: Write a regular expression which matches any phone number.
     *
     * A phone number in this example consists either out of 7 numbers
     * in a row or out of 3 number, a (white)space or a dash and then 4 numbers.
     */
    private static void testPhoneNumberTest() {
        String pattern = "\\d\\d\\d([,\\s-])\\d\\d\\d\\d";
        String s= "1233323322";
        System.out.println(s+" "+(s.matches(pattern)));
        s = "1233323";
        System.out.println(s+" "+s.matches(pattern));
        s = "123 3323";
        System.out.println(s+" "+s.matches(pattern));
        s = "123-3323";
        System.out.println(s+" "+s.matches(pattern));
        s = "123,3323";
        System.out.println(s+" "+s.matches(pattern));
    }

    /**
     *  The following example will check if a text contains a number with 3 digits.
     */
    public static void testSpecificNumber() {
        String s= "1233";
        System.out.println(s+" "+(test(s)));
        s= "0";
        System.out.println(s+" "+test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        System.out.println(s+" "+(test(s)));
        s = "99900234";
        System.out.println(s+" "+test(s));
    }




    public static boolean test (String s){
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()){
            return true;
        }
        return false;
    }

}