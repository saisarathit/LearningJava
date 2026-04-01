package com.learnjavabasics;

/*
Instance Initializer Block is used to initialize instance variables.
It runs every time when an object of the class is created and can perform additional operations while initializing.
*/


public class LearnInstanceInitializerBlock {
    int speed;
    public LearnInstanceInitializerBlock(){
        System.out.println("Speed is : " + speed);
        System.out.println("parent class constructor is invoked");
    }
    {
        System.out.println("Actual Speed");
        speed = 100;
        System.out.println("instance initializer block is invoked");
    }

    public class LearnInstanceInitializerBlock1 extends LearnInstanceInitializerBlock {
        public LearnInstanceInitializerBlock1() {
            super();
            System.out.println("child constructor invoked");
        }
    }

    static void main(String[] args) {
        LearnInstanceInitializerBlock liib = new LearnInstanceInitializerBlock();

    }

}
