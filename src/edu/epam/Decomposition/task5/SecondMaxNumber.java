package edu.epam.Decomposition.task5;

//      Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//      которое меньше максимального элемента массива, но больше всех других элементов)

import java.util.*;

public class SecondMaxNumber {

    Random rnd = new Random();
    int size, arraySize, secondMax;
    int[] array;

    public static void main(String[] args) {

        SecondMaxNumber numberIs = new SecondMaxNumber();
        int result = numberIs.secondMaxValueFinder();

        System.out.println("The second max value in the array is " + result);
    }

    int sizeGenerator() {

        size = rnd.nextInt(11);

        return size;
    }

    int[] contentGenerator() {

        arraySize = sizeGenerator();
        array = new int[arraySize];

        System.out.println("Size of the array is " + arraySize);

        System.out.println("Values of array is ");

        for (int counter = 0; counter < arraySize; counter ++) {

            array[counter] = rnd.nextInt(11);

            System.out.print(array[counter] + " ");
        }

        return array;
    }

    int secondMaxValueFinder(){

        int[] arry = new int[sizeGenerator()];
        Arrays.sort(contentGenerator());

        System.out.println();
        //        secondMax =
        return 0;
    }
}
