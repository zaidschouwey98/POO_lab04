package ch.heigvd.poo;

import ch.heigvd.poo.Matrix;

public class Main {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Usage: <N1> <M1> <N2> <M2> <modulo>");
            return;
        }
        int N1 = Integer.parseInt(args[0]);
        int M1 = Integer.parseInt(args[1]);
        int N2 = Integer.parseInt(args[2]);
        int M2 = Integer.parseInt(args[3]);
        int modulo = Integer.parseInt(args[4]);

        Matrix matOne = new Matrix(N1, M1, modulo);
        Matrix matTwo = new Matrix(N2, M2, modulo);

        System.out.println("The modulus is " + modulo + "\n");

        System.out.println("one");
        System.out.println(matOne);

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

        /*
        int[][] oneContent = {
                {1, 3, 1, 1},
                {3, 2, 4, 2},
                {1, 0, 1, 0}
        };

        Matrix matOne = new Matrix(oneContent, 5);


        int[][] twoContent = {
                {1, 4, 2, 3, 2},
                {0, 1, 0, 4, 2},
                {0, 0, 2, 0, 2}
        };

        */

    }
}