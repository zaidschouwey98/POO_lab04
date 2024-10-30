package ch.heigvd.poo;

import ch.heigvd.poo.Matrix;

public class Main {
    public static void main(String[] args) {
        int[][] oneContent = {
                {1, 3, 1, 1},
                {3, 2, 4, 2},
                {1, 0, 1, 0}
        };

        Matrix matOne = new Matrix(oneContent, 5);
        System.out.println("one");
        System.out.println(matOne);

        int[][] twoContent = {
                {1, 4, 2, 3, 2},
                {0, 1, 0, 4, 2},
                {0, 0, 2, 0, 2}
        };
        Matrix matTwo = new Matrix(twoContent, 5);
        System.out.println("two");
        System.out.println(matTwo);

        Matrix mat3 = matOne.add(matTwo);
        System.out.println("one + two");
        System.out.println(mat3);

        Matrix mat4 = matOne.sub(matTwo);
        System.out.println("one − two");
        System.out.println(mat4);

        Matrix mat5 = matOne.multiply(matTwo);
        System.out.println("one x two");
        System.out.println(mat5);
    }
}