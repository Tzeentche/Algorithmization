package edu.epam.ArraysOfArrays.task2;

//  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

import java.util.*;
import java.lang.*;

public class DiagonalElements {

    public static void main(String[] args) {

        int arraySizes = 0;

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Please,enter the size of User's array:");
            arraySizes = input.nextInt();

            int[][] squareMatrix = new int[arraySizes][arraySizes];

            System.out.println("User's array is: ");

            for (int lengthCounter = 0; lengthCounter < arraySizes; lengthCounter ++) {

                for (int depthCounter = 0; depthCounter < arraySizes; depthCounter ++) {

                    squareMatrix[lengthCounter][depthCounter] = (int)(Math.random() * 6 - 2);

                    System.out.print(squareMatrix[lengthCounter][depthCounter] + " ");
                }

                System.out.println(" ");
            }

            for (int lengthCounter = 0; lengthCounter < arraySizes; lengthCounter ++) {

                for (int depthCounter = 0; depthCounter < arraySizes; depthCounter ++) {

                    if (lengthCounter == depthCounter) {

                        System.out.println(squareMatrix[lengthCounter][depthCounter] + " ");
                    }
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered wrong walue. Let's try again!");
        }
    }
}
