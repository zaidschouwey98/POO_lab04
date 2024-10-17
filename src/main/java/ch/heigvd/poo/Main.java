package ch.heigvd.poo;

import ch.heigvd.poo.Matrix;

public class Main {
    public static void main(String[] args) {
        int M = 5;
        int N = 3;
        int n = 15;

        Matrix matrix = new Matrix(M, N, n);
        matrix.displayMatrix();
    }
}