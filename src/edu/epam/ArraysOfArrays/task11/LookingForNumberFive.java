package edu.epam.ArraysOfArrays.task11;

//      Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
//      в которых число 5 встречается три и более раз.
import java.util.*;

public class LookingForNumberFive {

    public static void main(String[] args) {

//        Declare using variables:

        int mediator = 0;
        String rowsCounter = "";
        int[][] array = new int[5][20];

        Random rnd = new Random();

//      We know the size of our array and value, that we looking for. Let's fill that array, display the result
//      of filling the array:

        System.out.println("Result of filling our array with random values from 0 to 15 is next: ");
        try {

            for (int firstCounter = 0; firstCounter < 5; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < 20; secondCounter ++) {

                    array[firstCounter][secondCounter] = rnd.nextInt(7);

                    System.out.print(array[firstCounter][secondCounter] + " ");

//            Algorithm for finding number 5 in rows:

                    if (array[firstCounter][secondCounter] == 5) {

                        mediator += 1;

                        if (mediator >= 3) {

                            rowsCounter += (firstCounter + 1) + " ";

                            mediator = 0;
                        }
                    }
                }

                mediator = 0;

                System.out.println(" ");
            }

            System.out.println("Numbers of rows, where the number \"5\" occurred 3 times or more are as follows: "
                    + rowsCounter);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Your data sets are too large. They do not fit into the array!");
        }

    }
}
