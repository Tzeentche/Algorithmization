package edu.epam.OneDimentionalSorting.task2;

//      Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... bm. Образовать из них новую последовательность
//      чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.*;

public class ArraysUnion {

    public static void main(String[] args) {

        //        Declare values:

        int firstArraySize, secondArraySize;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] firstArray, secondArray;

        try {

//            Set sizes of arrays and index of insert:

            System.out.println("Please, enter the size of first array: ");
            firstArraySize = input.nextInt();

            System.out.println("Please, enter the size of second array: ");
            secondArraySize = input.nextInt();

            firstArray = new int[firstArraySize + secondArraySize];
            secondArray = new int[secondArraySize];

//            Fill the arrays with random values:

            System.out.println("First array is: ");

            for(int firstCounter = 0; firstCounter < firstArraySize; firstCounter ++) {

                firstArray[firstCounter] = rnd.nextInt(11);

                System.out.print(firstArray[firstCounter] + " ");
            }

            System.out.println(" ");

            System.out.println("Second array is: ");

            for(int secondCounter = 0; secondCounter < secondArraySize; secondCounter ++) {

                secondArray[secondCounter] = rnd.nextInt(11);

                System.out.print(secondArray[secondCounter] + " ");
            }

            System.out.println(" ");

//            Insert second array with first array:

            System.out.println("Result of insert second array in first array is: ");

            for(int thirdCounter = 0; thirdCounter < secondArraySize; thirdCounter ++) {

                        firstArray[firstArraySize + thirdCounter] = secondArray[thirdCounter];
            }

//            Sorting and output result:

            Arrays.sort(firstArray);

            for (int finalCountdown = 0; finalCountdown < firstArraySize + secondArraySize; finalCountdown ++) {

                System.out.print(firstArray[finalCountdown] + " ");
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-numeric value. Keep calm and try again!");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Your values fell out of the array. Our condolences.");
        }
    }
}
