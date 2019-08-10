package edu.epam.ArraysOfArrays.task10;

//Найти положительные элементы главной диагонали квадратной матрицы

import java.util.*;

public class MainDiagonal {

    public static void main(String[] args) {

//        Declare using values:

        int[] buffer;
        int mediator = 0;
        int size;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Please, enter numeric value for determining the size of array: ");
            size = input.nextInt();

//            Declare and fill the array with values, output result:

            int[][] array = new int[size][size];

            System.out.println("Our array has the next form: ");

            for(int firstCounter = 0; firstCounter < size; firstCounter ++) {

                for(int secondCounter = 0; secondCounter < size; secondCounter ++) {

                    array[firstCounter][secondCounter] = (rand.nextInt(21) - 10);

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
            }

//            Initialize buffer array:

            buffer = new int[size];

//            Algorithm for finding positive elements of main diagonal:

            System.out.println("Positive values of main diagonal is: ");

            for (int firstIndex = 0; firstIndex < size; firstIndex++) {

                    if (array[firstIndex][firstIndex] > 0) {

                        buffer[firstIndex] = array[firstIndex][firstIndex];

                        System.out.print(buffer[firstIndex] + " ");
                    }
            }

        } catch(InputMismatchException e) {

            System.out.println("You entered non-numeric value. Let's try one more time?");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Something going wrong, and your array out of bound! Our condolences...");
        }

    }
}
