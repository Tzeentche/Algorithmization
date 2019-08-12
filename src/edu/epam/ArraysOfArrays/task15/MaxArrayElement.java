package edu.epam.ArraysOfArrays.task15;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.*;

public class MaxArrayElement {

    public static void main(String[] args) {

//      Declare values, we using for:

        int maxValue = 0;
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

                    if (maxValue < array[firstCounter][secondCounter]) {

                        maxValue = array[firstCounter][secondCounter];
                    }
                }

                System.out.println(" ");
            }

//            Finding ODD numbers and exchange it on max value:

            System.out.println("Array with exchanging odd values: ");

            for (int rowSorting = 0; rowSorting < size; rowSorting ++) {

                for (int columnSorting = 0; columnSorting < size; columnSorting ++) {

                        if ((array[rowSorting][columnSorting] % 2) == 1) {

                            array[rowSorting][columnSorting] = maxValue;
                        }

                    System.out.print(array[rowSorting][columnSorting] + " ");
                }

                System.out.println(" ");
            }

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("There are too many values here. As a result, some data went beyond the array");
        }
    }
}
