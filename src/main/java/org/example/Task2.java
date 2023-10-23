package org.example;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//Написать функцию, возвращающую разницу между
// самым большим и самым маленьким элементами переданного не пустого массива.
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println(searchMax(arrayNumber) - searchMin(arrayNumber));
    }

    public static int[] createArray() {
        Random random = new Random();
        int[] arrayNumber = new int[6];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(10);
        }
        return arrayNumber;
    }

    public static int searchMax(int[] arrayNumber) {
        int max = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if(max < arrayNumber[i]) {
                max = arrayNumber[i];
            }
        }
        return max;
    }

    public static int searchMin(int[] arrayNumber) {
        int min = arrayNumber[0];
        for (int i = 1; i < arrayNumber.length; i++) {
            if (min > arrayNumber[i]) {
                min = arrayNumber[i];
            }
        }
        return min;
    }

}
