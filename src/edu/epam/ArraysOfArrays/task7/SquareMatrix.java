package edu.epam.ArraysOfArrays.task7;

//      Сформировать квадратную матрицу порядка N по правилу A[i, j] = sin((i^2 - j^2) / N)
//      и подсчитать количество положительных элементов в ней.

import java.util.*;

public class SquareMatrix {

    public static void main(String[] args) {

        int size = 0;
        int boofer = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter EVEN size for the array: ");
            size = input.nextInt();

            System.out.println("Yours array has next view: ");
            double[][] array = new double[size][size];

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                   array[firstCounter][secondCounter] = (Math.sin((Math.pow(firstCounter, 2) - Math.pow(secondCounter, 2))/ size));

                    System.out.print(array[firstCounter][secondCounter] + " ");

                    if (array[firstCounter][secondCounter] > 0) {

                        boofer += 1;
                    }
                }

                System.out.println(" ");
            }

            System.out.println("Value of positive numbers is " + boofer);

        } catch (InputMismatchException e) {

            System.out.println("You entered non-NUMERIC value.");
        }

    }
}
