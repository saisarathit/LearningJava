package com.learnjavabasics;

/*
Interface is a blueprint of a class that contains static constants and abstract methods.
An interface helps in achieving abstraction and supports multiple inheritance.
It cannot be instantiated, similar to an abstract class, and represents an IS-A relationship.
Since Java 8, interfaces can include default and static methods. Since Java 9, interfaces can also contain private methods.

An interface is used in Java for the following reasons:
To achieve abstraction by defining method signatures without implementation.
To support multiple inheritance, as a class can implement multiple interfaces.
To achieve loose coupling, making the code more flexible and easier to maintain.

Interface methods are public and abstract by default, while interface fields are public, static, and final by default.
*/

public interface LearnInterface {
    void print();
    default void test(){
        System.out.println("test interface");
    }
}

