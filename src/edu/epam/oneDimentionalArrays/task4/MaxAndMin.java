package edu.epam.oneDimentionalArrays.task4;

//  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.*;
import java.lang.*;

public class MaxAndMin {

    public static void main(String[] args) {

        int boofer;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the size of array, you want: ");
            int size = input.nextInt();

            int[] array = new int[size];

            for (int counter = 0; counter < size; counter ++) {

                array[counter] = (int)(Math.random() * (200 + 1) - 100);
            }

        } catch (InputMismatchException e){

            System.out.println("Something (in input) going wrong. Try one's more!");
        }
    }
}
