package com.learnjavabasics;

public class LearnString {
    static void main(String[] args) {
        /*Strings in Java are objects that can hold a sequence of characters contained within a pair of double quotes ("").
          Strings are immutable, meaning once a string is created, it cannot be changed
          This provides benefits such as better performance, security, and thread safety.
          Two ways to create strings are Using string literals and Using the new keyword
        */
        String s = "sai";
        String s1 = new String("sai");

        //== & equals
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        //charAt()
        char ch = s.charAt(1);
        System.out.println(ch);

        //toCharArray() - to convert character array
        char[] ch1 = s1.toCharArray();
        for (char c : ch1) {
            System.out.println(c);
        }

        //length()
        System.out.println(s.length());

        //concat
        String str = s.concat(s1);
        System.out.println(str);

        //substring
        String s2 = "sai sarath allada";
        System.out.println(s2.substring(1, 5));
        System.out.println(s2.substring(1));

        //tolowercase
        String s3 = "Sai Sarath";
        System.out.println(s3.toLowerCase());

        //touppercase
        String s4 = "Sai Surekha";
        System.out.println(s3.toUpperCase());

        //contains
        System.out.println(s2.contains("surekha"));

        //replace
        System.out.println(s2.replace("sai", "surekha"));

        //trim
        String s5 = "   surekha garre  ";
        System.out.println(s5.trim());
    }

}
