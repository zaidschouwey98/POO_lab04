package ch.heigvd.poo;

import ch.heigvd.poo.Matrix;

public class Main {
    public static void main(String[] args) {

        int sameSize1 [][] = {
                {1, 3, 1, 1},
                {3, 2, 4, 2},
                {1, 0, 1, 0}
        };
        Matrix mat1 = new Matrix(sameSize1, 5);

        int sameSize2 [][] = {
                {2, 3, 0, 2},
                {4, 2, 4, 2},
                {1, 6, 1, 0}
        };
        Matrix mat2 = new Matrix(sameSize2, 5);

        Matrix mat3 = mat1.add(mat2);
        System.out.println("Res add");
        mat3.displayMatrix();

        Matrix mat4 = mat1.sub(mat2);
        System.out.println("Res sub");
        mat4.displayMatrix();

        Matrix mat5 = mat1.multiply(mat2);
        System.out.println("Res multiply");
        mat5.displayMatrix();

        /*
        int M = 5;
        int N = 3;
        int n = 15;

        Matrix matrix = new Matrix(M, N, n);
        matrix.displayMatrix();

        Matrix Mat1 = new Matrix(M, N, n);
        Matrix Mat2 = new Matrix(M, N, 15);
        Matrix Mat3 = matrix.multiply(Mat2);

        Mat1.displayMatrix();
        System.out.println("\n");
        Mat2.displayMatrix();

        System.out.println("\n");
        Mat3.displayMatrix();
        System.out.println("\n");
        */

        // à terme
        /*
        Matrix Mat3 = Mat1.add(mat2);
        Matrix Mat4 = Mat1.sub(mat2);
        Matrix Mat5 = Mat1.times(mat2);
        Addtion op1;
        Matrix mat3 = op1.operate(mat1, mat2);
        */
        /*
        int oneContent [][] = {
                {1, 3, 1, 1},
                {3, 2, 4, 2},
                {1, 0, 1, 0}
        };

        Matrix matOne = new Matrix(oneContent, 5);

        System.out.println("one");
        mat1.displayMatrix();

        int twoContent [][] = {
                {1, 4, 2, 3, 2},
                {0, 1, 0, 4, 2},
                {0, 0, 2, 0, 2}
        };
        Matrix matTwo = new Matrix(twoContent, 5);
        System.out.println("two");
        mat2.displayMatrix();
        */
    }
}