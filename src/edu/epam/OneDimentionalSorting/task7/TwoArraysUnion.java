package edu.epam.OneDimentionalSorting.task7;

//        Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... an и b1 <= b2 <= ... <= bm.
//        Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
//        последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.*;

public class TwoArraysUnion {

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
            firstArray = new int[firstArraySize];

            System.out.println("Please, enter the size of second array: ");
            secondArraySize = input.nextInt();
            secondArray = new int[secondArraySize];

//            Fill the arrays with random values:

            System.out.println("First array is: ");

            for(int firstCounter = 0; firstCounter < firstArraySize; firstCounter ++) {

                firstArray[firstCounter] = rnd.nextInt(11);
            }

            Arrays.sort(firstArray);

            for (int firstCounter = 0; firstCounter < firstArraySize; firstCounter ++) {

                System.out.print(firstArray[firstCounter] + " ");
            }

            System.out.println(" ");

            System.out.println("Second array is: ");

            for(int secondCounter = 0; secondCounter < secondArraySize; secondCounter ++) {

                secondArray[secondCounter] = rnd.nextInt(11);
            }

            Arrays.sort(secondArray);

            for(int secondCounter = 0; secondCounter < secondArraySize; secondCounter ++) {

                System.out.print(secondArray[secondCounter] + " ");
            }

            System.out.println(" ");

//            Output indexes by insert second array in first array:

            System.out.println("Insert positions are: ");

            for(int secondCounter = 0; secondCounter < secondArraySize; secondCounter ++) {

                for(int firstCounter = 0; firstCounter < firstArraySize; firstCounter ++) {

                    if(firstArray[firstCounter] > secondArray[secondCounter]) {

                        System.out.print((firstArraySize - firstCounter + secondCounter - 3) + " ");

                        break;

                    } else if(firstArray[firstCounter] < secondArray[secondCounter]) {

                        System.out.print((firstArraySize - firstCounter + secondCounter - 1) + " ");

                        break;

                    } else if(firstArray[firstCounter] == secondArray[secondCounter]) {

                        System.out.print((firstArraySize - firstCounter + secondCounter - 2) + " ");

                        break;
                    }
                }
            }

        } catch (InputMismatchException e) {

            System.out.println("You entered non-numeric value. Keep calm and try again!");

        } catch(ArrayIndexOutOfBoundsException e2) {

            System.out.println("Your values fell out of the array. Our condolences.");
        }
    }
}
