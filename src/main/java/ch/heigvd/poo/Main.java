package ch.heigvd.poo;

import ch.heigvd.poo.Matrix;

public class Main {
    public static void main(String[] args) {
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
        // à terme
        /*
        Matrix Mat3 = Mat1.add(mat2);
        Matrix Mat4 = Mat1.sub(mat2);
        Matrix Mat5 = Mat1.times(mat2);
        Addtion op1;
        Matrix mat3 = op1.operate(mat1, mat2);
        */
    }
}