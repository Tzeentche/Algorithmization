package edu.epam.oneDimentionalArrays.task9;

//  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//  Если таких чисел несколько, то определить наименьшее из них

import java.util.*;
import java.lang.*;

public class FindDuplicates {

    public static void main(String[] args) {

        int firstBoofer, secondBoofer = 0, repeatNumber = 0;

        Scanner input = new Scanner (System.in);

        try {

            System.out.println("Please, enter desired size of your's array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("User's array's values are: ");

            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

            array[firstCounter] = (int)(Math.random() * 10) - 5;

                System.out.print(array[firstCounter] + " ");
            }

            System.out.println(" ");

            for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                firstBoofer = 0;

                for (int thirdCounter = 0; thirdCounter < size; thirdCounter ++) {

                    if (array[secondCounter] == array[thirdCounter]) {
                        firstBoofer++;
                    }
                }

                    if (firstBoofer > secondBoofer) {

                        secondBoofer = firstBoofer;
                        repeatNumber = array[secondCounter];

                    } else {

                        repeatNumber = (firstBoofer == secondBoofer) ? (repeatNumber > array[secondCounter])?
                                array[secondCounter] : repeatNumber : repeatNumber;
                    }
                }

            System.out.println("Repeated number for value " + repeatNumber + " is " + secondBoofer);

        } catch (InputMismatchException e) {

            System.out.println("You entered wrong value. Let's try again next time!");
        }
    }
}