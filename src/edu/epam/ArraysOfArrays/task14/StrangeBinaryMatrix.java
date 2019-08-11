package edu.epam.ArraysOfArrays.task14;

//      Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//      единиц равно номеру столбца

import java.util.*;

public class StrangeBinaryMatrix {

    public static void main(String[] args) {

//        Initialize values, that's we use in our program:

        int buffer = 0;
        int m;
        int n;

        Random rnd = new Random();

        System.out.println("This array looks like the next: ");
        m = (rnd.nextInt(3) + 2);
        n = m + 1;

//        Show the size of columns and rows for the array:

        System.out.println("Value of columns is: " + m);
        System.out.println("Value of rows is: " + n);

        int[][] array = new int[n][m];

//        Fill the array with 1/0 values:

        try {

            for (int firstCounter = 0; firstCounter < n; firstCounter ++) {

                for (int secondCounter = 0; secondCounter < m; secondCounter ++) {

                    if (buffer < firstCounter) {

                        array[firstCounter][secondCounter] = 0;

                        buffer += 1;

                    } else {

                        array[firstCounter][secondCounter] = 1;
                    }
//          Show the array result:

                    System.out.print(array[firstCounter][secondCounter] + " ");
                }

                System.out.println(" ");
                buffer = 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("It's so awful, but your values fellout of the array. Try again another time.");
        }
    }
}
