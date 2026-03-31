package com.learnjavabasics;

public class LearnVariables {

    /*instance variables
    A variable declared inside the class but outside the body of the method
    It is not declared as static.*/
    String name;
    int age;

    /*static variable
    A variable that is declared as static is called a static variable
    You can create a single copy of the static variable and share it among all the instances of the class
    Memory allocation for static variables happens only once when the class is loaded in the memory.*/
    static String city = "hyd";

    /*public LearnVariables(){
        name = "sai";
        age = 23;
    }*/

    public LearnVariables(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name + " " + age + " " + city);
    }

    public static void main(String[] args) {

        /*local variables
        A variable declared inside the body of the method
        You can use this variable only within that method
        other methods in the class aren't even aware that the variable exists*/
        int num = 10;
        System.out.println(num);

        LearnVariables learnVariables = new LearnVariables("sai", 35);
        LearnVariables learnVariables1 = new LearnVariables("sarath", 36);
        learnVariables.display();
        learnVariables1.display();
    }

}
