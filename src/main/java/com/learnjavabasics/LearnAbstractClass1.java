package com.learnjavabasics;

public class LearnAbstractClass1 extends LearnAbstractClass{
    void test(){
        System.out.println("implemented abstract method");
    }

    static void main(String[] args) {
        LearnAbstractClass1 la1 = new LearnAbstractClass1();
        la1.test();
    }
}
