package edu.epam.oneDimentionalArrays.task6;

//  Задана последовательность N вещественных чисел. Вычислить сумму чисел,
//  порядковые номера которых являются простыми числами

import java.util.*;
import java.lang.*;

public class SummByIndex {

    public static void main(String[] args) {

        int boofer, accumulation = 0;

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please, enter size of array: ");
            int size = input.nextInt();

            int[] array = new int[size];

            System.out.println("Values of array are: ");
            for (int counter1 = 0; counter1 < size; counter1 ++) {

                array[counter1] = (int) (Math.random() * 21) - 10;
            }

            for (int counter2 = 2; counter2 < size; counter2++) {

                boofer = 0;
                for (int counter3 = 1; counter3 <= counter2; counter3++) {
                    if (counter2 % counter3 == 0)
                        boofer++;
                }

                if (boofer <= 2) {

                System.out.println("In the cell of the array with the index " + counter2 +
                        " is the value of " + array[counter2]);

                accumulation += array[counter2];
                }
            }

            System.out.println("Summ of values for cells in array with simple numbers is " + accumulation);

        } catch (InputMismatchException e) {

            System.out.println("Unfortunately, you entered wrong value. Try again once more...");
        }
    }
}
