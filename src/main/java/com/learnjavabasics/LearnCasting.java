package com.learnjavabasics;

public class LearnCasting {
    static void main(String[] args) {
        double numDuble = 12.96;
        System.out.println(numDuble);

        //double to int
        int numInt = (int) numDuble;
        System.out.println(numInt);

        //int to double
        int inum = 9;
        System.out.println((double)inum);

        int inumber = 12;
        System.out.println(inumber);

        String numString = String.valueOf(inumber);
        System.out.println(numString);

        int intinuber = Integer.parseInt(numString);
        System.out.println(intinuber);
    }
}
