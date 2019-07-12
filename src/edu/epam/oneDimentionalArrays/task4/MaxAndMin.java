package edu.epam.oneDimentionalArrays.task4;

//  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.*;
import java.lang.*;

public class MaxAndMin {

    public static void main(String[] args) {

        int maxValue, minValue, boofer;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the size of array, you want: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Values of array is: ");
            for (int counter1 = 0; counter1 < size; counter1 ++) {

                array[counter1] = (int)(Math.random() * (201) - 100);

                System.out.print(array[counter1] + " ");
            }
            System.out.println(" ");

            maxValue = 0;
            minValue = 0;

            for (int counter2 = 0; counter2 < size; counter2 ++) {

                if (array[counter2] > array[maxValue]) {

                    maxValue = counter2;
                }

                if (array[counter2] < array[minValue]) {

                    minValue = counter2;
                }
            }

            boofer = array[maxValue];
            array[maxValue] = array[minValue];
            array[minValue] = boofer;

            System.out.println("New array is: ");
            for (int counter = 0; counter < size; counter ++) {

                System.out.print(array[counter] + " ");
            }

        } catch (InputMismatchException e){

            System.out.println("Something (in input) going wrong. Try one's more!");
        }
    }
}
