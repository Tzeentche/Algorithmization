package edu.epam.OneDimentionalSorting.task6;

//        Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//        Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
//        на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//        Составить алгоритм этой сортировки.

import java.util.*;

public class ShellSorting {

    public static void main(String[] args) {

//        Declare vales:

        int buffer = 0, minIndex = 0, intermediary, size;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] array;

        try {

//            Input the size of the array and fill it with random values. Sorting 1/2 array, output result:

            System.out.println("Please enter a numerical value, that will indicate the size of the array: ");
            size = input.nextInt();
            array = new int[size];

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                array[firstCounter] = rnd.nextInt(size + 1);

                System.out.print(array[firstCounter] + " ");
            }

            System.out.println(" ");

//            Algorithm of Shell-sorting of array:

            buffer = size / 2;

            while(buffer > 0) {

                for (int index = 0; index < (size - buffer); index ++) {

                    intermediary = index;

                    while (intermediary >= 0 && array[intermediary] > array[intermediary + buffer]) {

                        minIndex = array[intermediary];
                        array[intermediary] = array[intermediary + 1];
                        array[intermediary + 1] = minIndex;

                        intermediary --;
                    }
                }

                buffer = buffer / 2;
            }

//            Output result of sorting:

            System.out.println("Result of Shell-sorting of array: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                System.out.print(array[firstCounter] + " ");
            }

            System.out.println(" ");

//            Exceptions:

        } catch(InputMismatchException e) {

            System.out.println("Your value was non-numeric. You can try again next time.");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Something wrong happened, and amount of data exceeded the size of the array.");
        }
    }
}
