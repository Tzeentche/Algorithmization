package edu.epam.ArraysOfArrays.task1;

//  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

import java.util.*;
import java.lang.*;

public class OddColumns {

    public static void main(String[] args) {

        String[] arrayCharacteristic = new String[]{"LINES", "COLUMNS"};
        int[] arrayDimensions = new int[2];

        Scanner input = new Scanner(System.in);

        try {

            for (int indexCounter = 0; indexCounter < 2; indexCounter ++) {

                System.out.println("Please, enter quantity of " + arrayCharacteristic[indexCounter] + " for array: ");
                arrayDimensions[indexCounter] = input.nextInt();
            }

            System.out.println("Values of your array are: ");

            int[][] arrayOfArrays = new int[arrayDimensions[0]][arrayDimensions[1]];

            for (int linesCounter = 0; linesCounter < arrayDimensions[0]; linesCounter ++) {

                for (int columnsCounter = 0; columnsCounter < arrayDimensions[1]; columnsCounter ++) {

                    arrayOfArrays[linesCounter][columnsCounter] = (int)(Math.random() * 6 - 2);

                    System.out.print(arrayOfArrays[linesCounter][columnsCounter] + " ");
                }

                System.out.println(" ");
            }

            System.out.println("Matching columns from base array will be: ");

            for (int linesCounter = 0; linesCounter < arrayDimensions[0]; linesCounter ++) {

                for (int columnsCounter = 0; columnsCounter < arrayDimensions[1]; columnsCounter ++) {

                    if (columnsCounter % 2 == 0 & arrayOfArrays[0][columnsCounter] >
                            arrayOfArrays[arrayDimensions[0] - 1][columnsCounter]) {

                        System.out.print(arrayOfArrays[linesCounter][columnsCounter] + " ");
                    }
                }

                System.out.println(" ");
            }
            
        } catch (InputMismatchException e) {

            System.out.println("You input wrong value. When you are ready, try again!");
        }
    }
}
