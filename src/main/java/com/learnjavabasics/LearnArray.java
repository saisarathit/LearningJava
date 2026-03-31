package com.learnjavabasics;

/* array is used for storing elements of the same data type in a fixed-sized collection
 *  Ordered by insertion
 */

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    static void main(String[] args) {

        //declaration of array
        int[] num;

        //creating an array
        int[] n = new int[5];

        //initialize an array
        int[] marksArray = {50, 60, 70, 80, 90};

        //Access specific index
        System.out.println(marksArray[0]);

        //modify array value
        System.out.println(marksArray[1] = 65);

        //length of the array
        System.out.println(marksArray.length);

        //converts an array into a string format
        System.out.println(Arrays.toString(marksArray));

        //forloop
        for (int i = 0; i < marksArray.length; i++) {
            System.out.println(marksArray[i]);
        }
        //enhanced forloop
        for (int marks : marksArray) {
            System.out.println(marks);
        }

        //creating string array
        //here default string values are null
        String[] studentList = new String[3];

        //initialize sring array
        String[] studentsList = { "sai", "surekha", "sarath"};

        for(String sList : studentsList){
            System.out.println(sList);
        }

        //sort arrays
        Arrays.sort(studentsList);
        //sort reverse order
        Arrays.sort(studentsList, Collections.reverseOrder());
        for(String sortList : studentsList){
            System.out.println(sortList);
        }

    }
}
