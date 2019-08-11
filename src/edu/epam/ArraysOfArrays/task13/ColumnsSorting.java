package edu.epam.ArraysOfArrays.task13;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.*;

public class ColumnsSorting {

    public static void main(String[] args) {

//        Declare mostly using variables:

        int buffer = 0;
        int size = 5;
        int[][] array = new int[size][size];

        Random rnd = new Random();

//        We did not receive a specific task on the size of the array and how to fill it, so it will be
//        a randomly filling array of 5x5 size:

        System.out.println("User's array looks like that: ");

        try {

            for(int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                    array[firstCounter][secondCounter] = rnd.nextInt(11);

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

//            We make UP- and DOWN-sorting the array's columns by Bubble method:

            System.out.println("Array with UP-sorting columns looks like that: ");

            for (int rowSorting = 0; rowSorting < size; rowSorting ++) {

                for (int sorting = 0; sorting < size; sorting ++) {

                    for (int enumenator = 0; enumenator < size - sorting - 1; enumenator ++) {

                        if (array[enumenator][rowSorting] > array[enumenator + 1][rowSorting]) {

                            buffer = array[enumenator + 1][rowSorting];
                            array[enumenator + 1][rowSorting] = array[enumenator][rowSorting];
                            array[enumenator][rowSorting] = buffer;
                        }
                    }

                    System.out.print(array[rowSorting][sorting] + " ");
                }

                System.out.println(" ");
            }

            System.out.println("Array with DOWN-sorting columns looks like that: ");

            for (int rowSorting = 0; rowSorting < size; rowSorting ++) {

                for (int sorting = 0; sorting < size; sorting ++) {

                    for (int enumenator = 0; enumenator < size - sorting - 1; enumenator ++) {

                        if (array[enumenator][rowSorting] < array[enumenator + 1][rowSorting]) {

                            buffer = array[enumenator + 1][rowSorting];
                            array[enumenator + 1][rowSorting] = array[enumenator][rowSorting];
                            array[enumenator][rowSorting] = buffer;
                        }
                    }

                    System.out.print(array[rowSorting][sorting] + " ");
                }

                System.out.println(" ");
            }

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("There are too many values here. As a result, some data went beyond the array");
        }
    }
}
