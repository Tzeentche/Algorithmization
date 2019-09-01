package edu.epam.Decomposition.task3;

//      Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника

import java.util.*;

public class SixAngle {
    public static void main(String[] args) {

//        Create class instance and call method with sixangle square calculated formula, output result

        SixAngle calculate = new SixAngle();
        double output = calculate.sixangleSquare();

        System.out.println("Sixangle's square is " + output);

    }

//    Call method with threeangle calculated formula and calculate square result for sixangle

    double sixangleSquare() {

        double a = trianglesSquare();

        double resultSquare = a * 6;

        return resultSquare;
    }

//    Take size of side by random generator, calculate (by formula) square of triangle with equals sides

    double trianglesSquare() {

        int a = triangle();

        double square = ((a * a) * Math.sqrt(3)) / 4;

        System.out.println("Triangle's square is " + square);

        return square;
    }

//    Generate random size of triangle's side

    int triangle() {

        Random rnd = new Random();
        int side = rnd.nextInt(11);
        System.out.println("The size of triangle's side is " + side);

        return side;
    }
}
