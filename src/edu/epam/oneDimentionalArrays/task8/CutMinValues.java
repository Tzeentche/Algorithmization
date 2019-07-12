package edu.epam.oneDimentionalArrays.task8;

//  Даны действительные числа a1, a2, ...,an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1, a2, ...,an)

import java.util.*;
import java.lang.*;

public class CutMinValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter size of array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("User's array looks like that: ");
            for (int firstCounter = 0; firstCounter < size; firstCounter ++) {

                array[firstCounter] = (int)(Math.random() * 5) - 6;

                System.out.println("Array's index " + firstCounter + " has value, equal " + array[firstCounter]);
            }

            int minValue = 0;

            for (int secondCounter = 0; secondCounter < size; secondCounter ++) {

                if (array[secondCounter] < minValue) {

                    minValue = array[secondCounter];
                }
            }

            System.out.println("Index min array's value was " + minValue);
            System.out.println("Now user's array looks like that: ");

            for (int thirdCounter = 0; thirdCounter < size; thirdCounter ++) {

                if (array[thirdCounter] != minValue) {

                    System.out.print(array[thirdCounter] + " ");
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("It was bad idea - entered wrong value. Don't make it again!");
        }
    }
}
