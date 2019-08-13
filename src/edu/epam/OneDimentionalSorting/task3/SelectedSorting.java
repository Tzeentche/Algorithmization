package edu.epam.OneDimentionalSorting.task3;

//      Сортировка выбором. Дана последовательность чисел a1<= a2 <= a3 ...<= an. Требуется переставить элементы так,
//      чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//      элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//      повторяется. Написать алгоритм сортировки выбором

import java.util.*;
import java.lang.*;

public class SelectedSorting {

    public static void main(String[] args) {

//        Declare values, that's we using:

        int max, boofer;
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        try {

//            User sets the size of the array:

            System.out.println("Please, enter size for the array: ");
            int size = input.nextInt();

//            Fill the array by random values:

            System.out.println("Your array looks like that: ");
            int[] array = new int[size];

            for (int index = 0; index < size; index ++) {

                array[index]= rnd.nextInt(11);

                System.out.print(array[index] + " ");
            }

            System.out.println(" ");

//            Sorting array by selection:

            for (int firstCounter = 0; firstCounter < size - 1; firstCounter++) {

                max = firstCounter;

                for (int secondCounter = firstCounter + 1; secondCounter < size; secondCounter++) {

                    if (array[secondCounter] > array[max])

                        max = secondCounter;
                }

                boofer = array[max];
                array[max] = array[firstCounter];
                array[firstCounter] = boofer;
            }

//            Output array after sorting:

            System.out.println("Array after sorting is: ");

            for (int thirdCounter = 0; thirdCounter < size; thirdCounter ++){

                System.out.print(array[thirdCounter] + " ");
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-NUMERIC value.");
        }
    }
}
