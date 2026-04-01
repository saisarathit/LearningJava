package com.learnjavabasics;

/*
Abstract Classes are used to define the structure and behavior of classes within an inheritance hierarchy.
A class declared using the abstract keyword is known as an abstract class in Java.

It can contain both abstract methods (methods without a body) and non-abstract methods (methods with a body).
Abstract methods do not have a body and must be implemented by the subclasses.
It can have abstract and non-abstract methods.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*/

public abstract class LearnAbstractClass {
    abstract void test();
}
