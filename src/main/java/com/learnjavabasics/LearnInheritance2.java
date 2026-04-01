package com.learnjavabasics;

public class LearnInheritance2 {
    static void main(String[] args) {
        LearnInheritance1 li1 = new LearnInheritance1();
        li1.start();
        li1.stop();
        li1.honk();

        LearnMethodOverriding lm = new LearnMethodOverriding();
        lm.sound();

        LearnMethodOverriding1 lm1 = new LearnMethodOverriding1();
        lm1.sound();

        // Up Casting : Parent class refers to the object of Child class
        LearnMethodOverriding lm2 = new LearnMethodOverriding1(); //up casting
        lm2.sound();

        LearnAbstraction la = new LearnAbstraction1();
        la.makeSound();
        la.breathe();

        LearnSuper1 ls1 = new LearnSuper1();
        ls1.display();
    }
}
