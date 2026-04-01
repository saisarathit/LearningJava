package com.learnjavabasics;

/*
Runtime Polymorphism
Runtime polymorphism, also known as Dynamic Method Dispatch
It is a process in which the call to an overridden method is resolved at runtime rather than at compile time.

Java Runtime Polymorphism with Data Member
A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
*/

public class LearnMethodOverriding {

    public void sound(){
        System.out.println("parent sound");
    }
}
