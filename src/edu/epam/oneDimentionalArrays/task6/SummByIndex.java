package edu.epam.oneDimentionalArrays.task6;

//  Задана последовательность N вещественных чисел. Вычислить сумму чисел,
//  порядковые номера которых являются простыми числами

import java.util.*;
import java.lang.*;

public class SummByIndex {

    public static void main(String[] args) {

        int boofer = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter size of array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Prime numbers are: ");
            for (int counter = 0; counter < size; counter ++) {

            array[counter] = (int)(Math.random() * 201) - 100;

            if (counter == 1 | counter == 2) {

                System.out.println("");
            }
            }

        } catch (InputMismatchException e) {

            System.out.println("Unfortunately, you entered wrong value. Try again once more...");
        }
    }
}
