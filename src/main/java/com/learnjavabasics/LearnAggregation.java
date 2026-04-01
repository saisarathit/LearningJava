package com.learnjavabasics;

/*Aggregation
Code Reusability: Aggregation is helpful to reuse the code as it allows one class to reuse the functionality of another class without inheriting it.
Better Design: It is useful when classes are related through a HAS-A relationship, not an IS-A relationship.
* */

public class LearnAggregation {
    public String name;
    public int id;
    LearnAggregationAddress learnAggregationAddress;

    public LearnAggregation(String name, int id, LearnAggregationAddress learnAggregationAddress){
        this.name = name;
        this.id = id;
        this.learnAggregationAddress = learnAggregationAddress;
    }

    public void display(){
        System.out.println(name+ " " + id + " " + learnAggregationAddress.city + " " + learnAggregationAddress.state + " " + learnAggregationAddress.country);
    }

    static void main(String[] args) {
        LearnAggregationAddress learnAggregationAddress = new LearnAggregationAddress("hyd","telangana", "india");
        LearnAggregation la = new LearnAggregation("sai", 123, learnAggregationAddress);
        la.display();

    }
}
