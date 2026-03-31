package com.learnjavabasics;

/*
Static variable:
The static variable can be used to refer to the common property of all objects (which is not unique for each object
The static variable gets memory only once in the class area at the time of class loading.
Static variables in Java are also initialized to default values if not explicitly initialized by the programmer.
They can be accessed directly using the class name without needing to create an instance of the class.
if the value of a static variable is changed in one instance, it will reflect the change in all other instances as well.
 */

/*public class LearnStatic {
    int age;
    String name;
    static String college = "ITS";

    public LearnStatic(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println(age + " " + name + " " + college);
    }

    public static void main(String[] args) {
        LearnStatic s1 = new LearnStatic(11, "Karan");
        LearnStatic s2 = new LearnStatic(22, "Aryan");

        LearnStatic.college="BBDIT";
        s1.display();
        s2.display();
    }
}*/


/*
Static Methods:
static method belongs to the class rather than the object of a class.
static method can be invoked without the need for creating an instance of a class.
static method can access static data members and can change their value of it.
*/
/*public class LearnStatic {
    int age;
    String name;
    static String college = "ITS";

    static void change(){
        college = "BBDIT";
    }

    public LearnStatic(int a, String n) {
        age = a;
        name = n;
    }

    void display() {
        System.out.println(age + " " + name + " " + college);
    }

    public static void main(String[] args) {
        LearnStatic.change();

        LearnStatic s1 = new LearnStatic(11, "Karan");
        LearnStatic s2 = new LearnStatic(22, "Aryan");

        s1.display();
        s2.display();
    }
}*/


/*
Static Block:
It is used to initialize the static data member.
It is executed before the main() method at the time of class loading.
*/
public class LearnStatic {

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method invoked");
    }
}