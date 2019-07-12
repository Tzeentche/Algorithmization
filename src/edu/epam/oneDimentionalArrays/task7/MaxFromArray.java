package edu.epam.oneDimentionalArrays.task7;


//  Даны действительные числа a1, a2, ...,an. Найти max(A1 + A2n, A2 + A2n−1, ..., An + An+1)

import java.util.*;
import java.lang.*;

public class MaxFromArray {

    public static void main(String[] args) {

        int boofer = 0, maxValue = 0, indexCatcher1 = 0, indexCatcher2 = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter a size of the array: ");
            int size = (input.nextInt() * 2);

            int[] array = new int[size];

            for (int counter1 = 0; counter1 < size; counter1++) {

                array[counter1] = (int)(Math.random() * 21) - 10;

                System.out.println("The value of array's cell " + counter1 + " is " + array[counter1]);
            }

            boofer = size;

            for (int counter2 = 0; counter2 < size / 2; counter2 ++) {

                if (maxValue < (array[counter2] + array[boofer - 1])) {

                    maxValue = array[counter2] + array[boofer - 1];

                    indexCatcher1 = counter2;
                    indexCatcher2 = boofer - 1;
                }

                boofer--;
            }

            System.out.println("Max summ multiplies values from array, consist from values with index " + indexCatcher1 +
                    " and " + indexCatcher2 + ", and is " + maxValue);

        } catch (InputMismatchException e) {

            System.out.println("Something going wrong. Next time type your numbers more carefully!");
        }
    }
}
