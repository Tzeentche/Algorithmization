package edu.epam.ArraysOfArrays.task6;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

import java.util.*;
import java.lang.*;

public class BinaryMatrix {

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

            System.out.println("Yours array has next view: ");
            int[][] array = new int[size][size];

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                  if (secondCounter >= firstCounter & secondCounter + firstCounter < size |
                      secondCounter <= firstCounter & secondCounter + firstCounter >= size - 1) {

                        array[firstCounter][secondCounter] = 1;
                    } else {

                        array[firstCounter][secondCounter] = 0;
                    }

                    if (secondCounter < size - 1) {

                        System.out.print(array[firstCounter][secondCounter] + " ");

                    } else {

                        System.out.println(array[firstCounter][secondCounter]);
                    }
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-NUMERIC value.");
        }
    }
}
