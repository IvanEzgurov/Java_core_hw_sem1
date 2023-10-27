package org.example;

import java.util.Arrays;


import static org.example.Task2.createArray;


public class Task3 {
    //Написать функцию, возвращающую истину, если
    // в переданном массиве есть два соседних элемента, с нулевым значением.
    public static void main(String[] args) {
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println(nearZero(arrayNumber));
    }
    public static boolean nearZero(int[] arrayNumber){
        for (int i = 0; i < arrayNumber.length-1 ; i++) {
            if ((arrayNumber[i] == arrayNumber[i+1]) && (arrayNumber[i] ==0))
                return true;

        }
        return false;
    }
}
