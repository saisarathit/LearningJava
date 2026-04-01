package com.learnjavabasics;

public class LearnSuper1 extends LearnSuper{
    String color = "black";

    public LearnSuper1(){
        super();
        System.out.println("child...");
    }

    void display() {
        System.out.println(color);
        System.out.println(super.color);
        super.eating();
        eating();
    }

    void eating(){
        System.out.println("eating too...");
    }
}
