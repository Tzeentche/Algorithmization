package edu.epam.ArraysOfArrays.task3;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.*;
import java.lang.*;

public class StringByCall {

    public static void main(String[] args) {

        int arraySize = 0;
        String[] direction = new String[]{"LINE", "COLUMN"};
        int[] call = new int[2];

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the size you want for your array: ");
            arraySize = input.nextInt();

            int[][] array = new int[arraySize][arraySize];

            System.out.println("Your array is: ");

            for (int arrayLine = 0; arrayLine < arraySize; arrayLine ++) {

                for (int arrayColumn = 0; arrayColumn < arraySize; arrayColumn ++) {

                    array[arrayLine][arrayColumn] = (int)(Math.random() * 6 - 2);

                    System.out.print(array[arrayLine][arrayColumn] + " ");
                }

                System.out.println(" ");
            }

            for (int index = 0; index < call.length; index ++) {

                System.out.println("Which " + direction[index] + " do you want to see?");
                call[index] = input.nextInt();
            }

            System.out.println("You choose the next line: ");

            for (int arrayCoumn = 0; arrayCoumn < arraySize; arrayCoumn ++){

                System.out.print(array[call[0] - 1][arrayCoumn] + " ");
            }

            System.out.println(" ");

            System.out.println("You choose the next column: ");

            for (int arrayLine = 0; arrayLine < arraySize; arrayLine ++) {

                System.out.println(array[arrayLine][call[1] - 1]);
            }

        } catch (InputMismatchException e) {

            System.out.println("Something horrible happened: it was not NUMBER input...");
        }
    }
}
