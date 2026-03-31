package com.learnjavabasics;

/*
Constructors are like normal methods within the class but are used to initialize the object of the class.
Constructors always have same name as their class name.
Constructors cannot be declared as abstract, static, final, and synchronized.
Constructors do not have any explicit return types.
Types of constructor:
Default constructor: These constructors do not accept any parameters.
Parameterized constructor: These constructors accept a specific number of parameters.
Constructor Overloading :
        A class can have multiple constructors with different parameters.
Constructors are used to:
Initialize object values
Set default values
Prepare objects when they are created

Example:
Student s = new Student("John", 22);
The constructor automatically assigns the values.
*/

public class LearnConstructor {
    int id;
    String name;

    //default constructor
    public LearnConstructor(){
        System.out.println("Test Constructor");
    }

    //Parameterized constructor
    public  LearnConstructor(int i, String n){
        this.id = i;
        this.name = n;
        System.out.println(id + " " +name);
    }

    static void main(String[] args) {
        LearnConstructor tc = new LearnConstructor();
        LearnConstructor tc1 = new LearnConstructor(1, "sai");
    }

}
