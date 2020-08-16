package com.ma.home;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int length = word.length() ;
        boolean isPalindrome = false;
        word = word.toLowerCase();
        for(int i=0; i<length; i++){
            if(word.charAt(i) == word.charAt(length - 1 - i)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
        System.out.println(Palindrome.isPalindrome("XXYYZZ"));
        System.out.println(Palindrome.isPalindrome("Abba"));
    }
}