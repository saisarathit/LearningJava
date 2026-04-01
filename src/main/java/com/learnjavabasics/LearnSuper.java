package com.learnjavabasics;

/*
Super keyword is a reference variable used to refer to the immediate parent class object
Simplifies Constructor Chaining: The super() call ensures that the parent class's constructor is executed before the child class's,
                                 maintaining proper initialization across the inheritance hierarchy.
Access to Overridden Methods: It allows a subclass to invoke a method from the parent class even when the subclass has overridden the method.
                                 This is useful for extending functionality without completely overriding it.
super() is added in each class constructor automatically by the compiler if there is no super() or this().
*/

public class LearnSuper {
    String color = "red";

    public LearnSuper(){
        System.out.println("parent...");
    }

    void eating (){
        System.out.println("eating...");
    }
}

