package edu.epam.oneDimentionalArrays.task10;

//  Дан целочисленный массив с количеством элементов п. Сжать массив,
//  выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
//  Примечание. Дополнительный массив не использовать

import java.util.*;
import java.lang.*;

public class ArrayCompression {

    public static void main(String[] args) {

        int size = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter the desired array size: ");
            size = input.nextInt();

            int[] sourceArray = new int[size];

            System.out.println("Your's array values are: ");
            for (int firstCounter = 0; firstCounter < size; firstCounter++) {

                sourceArray[firstCounter] = (int)(Math.random() * 10) - 5;

                System.out.print(sourceArray[firstCounter]+ " ");
            }

            System.out.println(" ");

            System.out.println("New array is: ");

            for (int secondCounter = 0; secondCounter < size; secondCounter += 2) {

                if (secondCounter > 0) {

                    sourceArray[secondCounter / 2] = sourceArray[secondCounter];
                }

                System.out.println("From cell " + secondCounter + " we move value " + sourceArray[secondCounter]
                        + " to position " + (secondCounter));
            }

        } catch (InputMismatchException e) {

            System.out.println("Something going wrong. Why did you decide to enter a non-numeric value?");

        } catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("Unfortunately, your's array was out of bound...");
        }
    }
}
