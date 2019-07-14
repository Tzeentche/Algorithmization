package edu.epam.ArraysOfArrays.task5;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

import java.util.*;
import java.lang.*;

public class ZeroMatrix {

    public static void main(String[] args) {

        int size = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter EVEN size for the array: ");
            size = input.nextInt();

            if (size % 2 != 0) {

                size += 1;
                System.out.println("You entered non-even number. But we fixed it.");
            }

            int[][] array = new int [size][size];

            System.out.println("Now your array look like that: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                    if ((firstCounter + secondCounter) >= size) {

                        array[firstCounter][secondCounter] = 0;

                    } else {

                        array[firstCounter][secondCounter] = firstCounter + 1;
                    }

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-NUMERIC value.");
        }
    }
}
