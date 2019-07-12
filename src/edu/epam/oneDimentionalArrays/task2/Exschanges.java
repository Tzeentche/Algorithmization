package edu.epam.oneDimentionalArrays.task2;

//  Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//  Заменить все ее члены, большие данного Z, этим числом.
//  Подсчитать количество замен

import java.util.*;
import java.lang.*;

public class Exschanges {

    public static void main(String[] args) {

        int exchangesCounter = 0;

        Scanner input = new Scanner(System.in);
        try {

            System.out.println("Please, enter size for array of numbers: ");
            int n = input.nextInt();

            System.out.println("Please, enter value for exchanging \"Z\" number : ");
            int z = input.nextInt();

            int[] a = new int[n];

            System.out.println("Please, enter numeric values for each position in array: ");
            for (int counter1 = 0; counter1 < n; counter1 ++) {

                a[counter1] = input.nextInt();

                if (a[counter1] > z) {

                    a[counter1] = z;
                    exchangesCounter += 1;
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered wrong value! Please, next time be more careful!");
        }

        System.out.println("We have interesting information for you: number of replacements is " +
                exchangesCounter + "! Congratulations!");
    }
}
