package org.example;

public class Task1 {
    //Написать метод, возвращающий количество чётных элементов массива.
    //countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static void main(String[] args) {

        int[] countEvans = {2, 1, 2, 3, 4};
        //int[] countEvans = {2, 2, 0};
        //int[] countEvans = {1, 3, 5};
        int even = 0;
        for (int i = 0; i < countEvans.length; i++) {
            if (countEvans[i] % 2 == 0)
                even++;
        }
        System.out.println(even);
    }
}
