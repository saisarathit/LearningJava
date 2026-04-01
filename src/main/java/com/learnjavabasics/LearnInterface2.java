package com.learnjavabasics;

public class LearnInterface2 implements LearnInterface, LearnInterface1{

    @Override
    public void print() {
        System.out.println("interface implemented");
    }

    static void main(String[] args) {
        LearnInterface2 li2 = new LearnInterface2();
        li2.print();
        li2.test();
    }

}
