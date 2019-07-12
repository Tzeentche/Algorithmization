package edu.epam.oneDimentionalArrays.task5;

//  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

import java.util.*;
import java.lang.*;

public class PrintMaxValues {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Please, enter size of the array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Elements, where their value is bigger, than their index, is: ");

            for (int counter = 0;counter < size; counter ++) {

            array[counter] = (int)(Math.random() * 21) - 10;

            if (array[counter] > counter) {

                System.out.println(array[counter] + " ");
            }
            }

            for (int counter = 0; counter < size; counter ++) {

                System.out.print(array[counter]+ " ");
            }

        }catch (InputMismatchException e) {


        }
    }
}
