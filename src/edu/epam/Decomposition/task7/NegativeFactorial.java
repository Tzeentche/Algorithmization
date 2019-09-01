package edu.epam.Decomposition.task7;

//      Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

import java.util.*;

public class NegativeFactorial {

    int boofer = 1;

    public static void main(String[] args) {

        NegativeFactorial result = new NegativeFactorial();
        int factSumm = result.calculator();

        System.out.println("Factorial odd numbers 1 to 9 is " + factSumm);
    }

    int calculator() {

        for (int counter = 1; counter < 10; counter += 2) {

            boofer = boofer * counter;

            System.out.println("Factorial " + counter + " is " + boofer);
        }

        return boofer;
    }

}
