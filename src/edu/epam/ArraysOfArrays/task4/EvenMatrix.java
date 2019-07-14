package edu.epam.ArraysOfArrays.task4;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

import java.util.*;

public class EvenMatrix {

    public static void main(String[] args) {

        int size = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter even number \"N\" array size:");
            size = input.nextInt();

            if (size % 2 != 0) {

                System.out.println("You input ODD number. We correct this unfortunate misunderstanding.");
                size += 1;
            }

            int[][] array = new int[size][size];

            for (int firstCounter = 0; firstCounter < size; firstCounter++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter++) {

                    if (firstCounter % 2 == 0) {

                        array[firstCounter][secondCounter] = secondCounter + 1;

                    } else if (firstCounter % 2 != 0) {

                    array[firstCounter][secondCounter] = size - secondCounter;
                    }

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

        } catch (InputMismatchException e) {

            System.out.println("It's was wrong value - non Numeric input!");
        }
    }
}
