package edu.epam.OneDimentionalSorting.task1;

//        Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//        дополнительный массив.

import java.util.*;

public class DottedUnionArrays {

    public static void main(String[] args) {

//        Declare values:

        int buffer = 0, koefficient = 1;
        int firstArraySize, secondArraySize, insertIndex;
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int[] firstArray, secondArray, resultArray;

        try {

//            Set sizes of arrays and index of insert:

            System.out.println("Please, enter the size of first array: ");
            firstArraySize = input.nextInt();

            System.out.println("Please, enter the size of second array: ");
            secondArraySize = input.nextInt();

            firstArray = new int[firstArraySize + secondArraySize];
            secondArray = new int[secondArraySize];

            System.out.println("Please, enter index of insert, less than " + firstArraySize + " : ");
            insertIndex = input.nextInt();

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

//            Unite second array with first array by index K:

            System.out.println("Result of insert second array in first array by index " + insertIndex + " is: ");

            for(int thirdCounter = 0; thirdCounter < (firstArraySize + secondArraySize); thirdCounter ++) {

                if(thirdCounter == insertIndex) {

                    for (int teleporter = insertIndex / 2; teleporter < insertIndex; teleporter ++) {

                        koefficient ++;
                        firstArray[firstArraySize + secondArraySize - insertIndex + teleporter] =
                                firstArray[firstArraySize - insertIndex + teleporter];
                    }

                    for (int intermeiateCounter = 0; intermeiateCounter < secondArraySize; intermeiateCounter ++) {

                        firstArray[intermeiateCounter + insertIndex] = secondArray[intermeiateCounter];
                    }
                }

                System.out.print(firstArray[thirdCounter] + " ");
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-numeric value. Keep calm and try again!");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Your values fell out of the array. Our condolences.");
        }
    }
}
