package edu.epam.oneDimentionalArrays.task3;

//  Дан массив действительных чисел, размерность которого N.
//  Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

import java.util.*;
import java.lang.*;

public class DiapasoneOfElements {

    public static void main(String[] args) {

        int positiveCounter = 0, negativeCounter = 0, zeroCounter = 0;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        try {

            System.out.println("Please, enter size of array: ");
            int n = input.nextInt();

            int[] array = new int[n];

            for (int counter1 = 0; counter1 < n; counter1++) {

                array[counter1] = (int)(Math.random() * (200 + 1)) - 100;

                System.out.println("Value of " + (counter1 + 1) + " number in array is: " + array[counter1]);

                if (array[counter1] > 1) {
                    positiveCounter += 1;

                } else if (array[counter1] < 1) {
                    negativeCounter += 1;

                } else {zeroCounter += 1; }
            }

        } catch (InputMismatchException e) {

            System.out.println("Your value was wrong.Let's try again, but next time...");
        }

        System.out.println("Total number of positive values is " + positiveCounter);
        System.out.println("Total number of negative values is " + negativeCounter);
        System.out.println("Total number of zero " + zeroCounter);
    }
}
