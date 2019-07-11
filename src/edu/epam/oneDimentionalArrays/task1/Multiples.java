package edu.epam.oneDimentionalArrays.task1;

//  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

import java.util.*;

public class Multiples {

    public static void main(String[] args) {

        int agregator = 0, k = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter size for array of numbers: ");
            int n = input.nextInt();

            System.out.println("Turn to enter value for multiply number: ");
            k = input.nextInt();

            System.out.println("Now please, enter values for each position in array: ");

            int[] a = new int[n];

            for (int counter1 = 0; counter1 < n; counter1 ++) {

                a[counter1] = input.nextInt();
            }

            for (int counter2 = 0; counter2 < n; counter2 ++) {

                if (a[counter2] % k == 0) {

                    agregator += a[counter2];
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("We have  bad news: you entered some bad dates, and all crashed... Let's try again!");
        }

        System.out.println("Summ of array's elements, that multiplies \"K\" is " + agregator);
    }
}
