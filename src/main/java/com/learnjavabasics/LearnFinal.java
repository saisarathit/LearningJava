package com.learnjavabasics;

/*
Final is used to restrict the user
We can use the final keyword with:
Variable : When a variable is declared as final, it is known as a final variable. Its value cannot be changed once initialized. It behaves like a constant.
Method : A method declared as final is known as a final method. Subclasses cannot override the final method.
Class : When any class declared as final is called final class. Note that the final class cannot be inherited.
Parameter : A final parameter is a method parameter whose value cannot be changed inside the method.

Inheriting a Final Method
A final method can be inherited by a child class, but it cannot be overridden.
This is useful when you want to keep method implementation remains unchanged in subclasses.

Advantages of Final:
Improved Performance: The final keyword enables the compiler to optimise code execution because final variables have fixed values,
                      which results in enhanced efficiency.
Security: Declaring classes and methods as final prevents unintended modifications, ensuring core functionality remains intact.
Clear Design Intent: It signals to developers that a class or method should remain unchanged, improving code readability and maintainability.
Immutability: Helps create immutable objects, which are essential for functional programming and multi-threaded applications.
Thread Safety: Final fields ensure consistency in concurrent environments, preventing unexpected modifications by different threads.
*/

//final class
//final public class LearnFinal {
public class LearnFinal {
    // final variable
    final int speed = 100;
    void run(){
        //speed = 200;
        System.out.println(speed);
    }

    //final method
    final void test(){
        System.out.println("final test");
    }

    public class LearnFinal1 extends LearnFinal {
       /* void test(){

        }*/
    }

    static void main(String[] args) {
        LearnFinal lf = new LearnFinal();
        lf.run();
    }

}

//final method