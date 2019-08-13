package edu.epam.OneDimentionalSorting.task4;

//      Дана последовательность чисел a1 <= a2 <=...<= an. Требуется переставить числа в порядке возрастания.
//      Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается
//      перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//      Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.*;

public class ExchaneSorting {

    public static void main(String[] args) {

//        Declare values:

        int buffer = 0;
        int numberOfsets = 0;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int size = 0;
        int leftShift, rightShift;

                try {

//                    Input the size of the array, fill the array by values:

                    System.out.println("Please, enter the size of the array: ");
                    size = input.nextInt();

                    int[] array = new int[size];

                    for (int fillCounter = 0; fillCounter < size; fillCounter ++) {

                        array[fillCounter] = rnd.nextInt(11);
                    }

//                    Exchange sorting algorithm:

                    leftShift = 0;
                    rightShift = size - 1;

                    do {

                        for (int index = leftShift; index < rightShift; index ++) {

                            if (array[index] > array[index + 1]) {

                                buffer = array[index];
                                array[index] = array[index + 1];
                                array[index + 1] = buffer;

                                numberOfsets += 1;
                            }
                        }

                        rightShift --;

                        for (int index = rightShift; index > leftShift; index --) {

                            if (array[index]<array[index-1]) {

                                buffer = array[index];
                                array[index] = array[index - 1];
                                array[index - 1] = buffer;

                                numberOfsets += 1;
                            }
                        }

                        leftShift ++;

                    } while (leftShift < rightShift);

//                    Output array after sorting:

                    for(int outputArray = 0; outputArray < size; outputArray ++) {

                        System.out.print(array[outputArray] + " ");
                    }

                    System.out.println(" ");
                    System.out.println("Number of sets is " + numberOfsets);

                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println("There are too many values here. As a result, some data went beyond the array");
                }
    }
}
