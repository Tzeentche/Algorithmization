package edu.epam.OneDimentionalSorting.task5;

//        Сортировка вставками. Дана последовательность чисел a1, a2,...,an. Требуется переставить числа в порядке
//        возрастания. Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т. е.
//        a1 <= a2 <= ... <= ai. Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
//        последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//        не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//        с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.*;

public class InsertSorting {

    public static void main(String[] args) {

//        Declare vales:

        int size;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] array;
        int secondCounter, index = 0, newValue = 0;

        try {

//            Input the size of the array and fill it with random values. Sorting 1/2 array, output result:

            System.out.println("Please enter a numerical value, that will indicate the size of the array: ");
            size = input.nextInt();
            array = new int[size];

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                array[firstCounter] = rnd.nextInt(11);

                System.out.print(array[firstCounter] + " ");
            }

            System.out.println(" ");

            for (secondCounter = 1; secondCounter < (size / 2); secondCounter ++) {

                newValue = array[secondCounter];
                index = secondCounter;

                while (index > 0 && array[index - 1] > newValue)
                {

                    array[index] = array[index - 1];
                    index--;
                }

                array[index] = newValue;

            }

            System.out.println("Result of sorting first 1/2 of array: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                System.out.print(array[firstCounter] + " ");
            }

            System.out.println(" ");

//                Sorting second 1/2 array with binary search:

            binarySorting(size, secondCounter, newValue, index, array);

        } catch(InputMismatchException e) {

            System.out.println("Your value was non-numeric. You can try again next time.");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Something wrong happened, and amount of data exceeded the size of the array.");
        }
    }

    public static void binarySorting(int size, int secondCounter, int newValue, int index, int[] array){

        for (secondCounter = (size / 2); secondCounter < size; secondCounter ++) {

            newValue = array[secondCounter];
            index = secondCounter;

            while (index > 0 && array[index - 1] > newValue)
            {

                array[index] = array[index - 1];
                index--;
            }

            array[index] = newValue;
        }

        System.out.println("Result of sorting second 1/2 of array: ");

        for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

            System.out.print(array[firstCounter] + " ");
        }

        System.out.println(" ");

    }
}
