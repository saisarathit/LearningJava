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

        LearnMethodOverriding lm2 = new LearnMethodOverriding1();
        lm2.sound();

        LearnAbstraction la = new LearnAbstraction1();
        la.makeSound();
        la.breathe();

    }
}
