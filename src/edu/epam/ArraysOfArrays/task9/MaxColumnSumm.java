package edu.epam.ArraysOfArrays.task9;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//        столбец содержит максимальную сумму.

import jdk.internal.util.xml.impl.Input;

import java.util.*;

public class MaxColumnSumm {

    public static void main(String[] args) {

//        Declare the variables that we will use in the work:
        int size = 0;
        int max = 0;
        String result = "";

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter size of your array:");
            size = input.nextInt();

//            Declare boofer array for counting max.column values:

            int[] buffer = new int[size];

//            Fill the array with values:

            System.out.println("Now the array looks like that:");
            int[][] array = new int[size][size];

            for (int firstCounter = 0; firstCounter < size; firstCounter++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                    array[firstCounter][secondCounter] = random.nextInt(10);

                    System.out.print(array[firstCounter][secondCounter] + " ");

                    buffer[secondCounter] += array[firstCounter][secondCounter];
                }

                System.out.println(" ");
            }

//            Output results of buffer's counter and finding column with max value:
            System.out.println("Columns addition result is:");

            max = buffer[0];
            result = "1";

            for (int firstIndex = 0; firstIndex < size; firstIndex++) {

                System.out.print(buffer[firstIndex] + " ");

                for (int secondIndex = 0; secondIndex < size; secondIndex++) {

                    if (max < buffer[secondIndex]) {

                        max = buffer[secondIndex];

                        result = "" + (secondIndex + 1);
                    }
                }
            }

            System.out.println(" ");
            System.out.println("Column with max value is " + result);

        } catch(InputMismatchException e) {

            System.out.println("You entered non-NAMERIC value! Try again next time...");
        }
    }
}
