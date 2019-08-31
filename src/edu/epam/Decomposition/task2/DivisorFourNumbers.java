package edu.epam.Decomposition.task2;

//      Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

import java.util.*;

public class DivisorFourNumbers {

    int[] valuesArray = new int[4];
    int divisor = 0;


    public static void main(String[] args) {


    }

    void Outputter() {

        System.out.println("Greatest common divisor of the values is " + GreatestCommonDivisor());
    }

    int GreatestCommonDivisor () {

        for (int firstCounter = 0; firstCounter < valuesArray.length; firstCounter ++) {

            valuesArray[firstCounter] = Randomiser();
            System.out.println("Value of first number is: " + valuesArray[firstCounter]);
        }

        return divisor;
    }

    int Formula(int firstNumb, int secondNumb, int thirdNumb, int fourthNumb) {

        
    }

    int Randomiser() {

        Random rnd = new Random();
        int value = rnd.nextInt(11);

        return value;
    }
}
