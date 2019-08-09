package edu.epam.ArraysOfArrays.task8;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.*;
import java.lang.*;

public class ExchangeColumns {

    public static void main(String[] args) {

        int size = 0;
        int boofer = 0;
        String[] columns = {"First","Second"};
        int[] values = new int[2];

        Scanner input = new Scanner(System.in);

        try {

            // Create array with equal sizes:

            System.out.println("Please, enter size for the array: ");
            size = input.nextInt();

//            Fill and output array of User's size with random content:

            System.out.println("Yours array has next view: ");
            int[][] array = new int[size][size];

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                        array[firstCounter][secondCounter] = (int)(Math.random() * 8 - 3);

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

            // Choose 2 columns, that we want to change:

            for (int index = 0; index < 2; index ++) {

                System.out.println("Please, enter numbers of " + columns[index] + " column, less than " + size +
                        " that you want to exchange: ");
                values[index] = input.nextInt();
            }

//          Rewrite array with columns, that we were changed:

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                    if (values[0] < values[1]) {

                        if (secondCounter == values[0] - 1) {

                            boofer = array[firstCounter][values[0] - 1];
                            array[firstCounter][values[0] - 1] = array[firstCounter][values[1] - 1];
                            array[firstCounter][values[1] - 1] = boofer;
                        }

                    } else {

                        if (secondCounter == values[1] - 1) {

                            boofer = array[firstCounter][values[1] - 1];
                            array[firstCounter][values[1] - 1] = array[firstCounter][values[0] - 1];
                            array[firstCounter][values[0] - 1] = boofer;
                        }
                    }

//                    Output old array with new content:

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-NUMERIC value.");
        }
    }
}
