package ch.heigvd.poo;

import java.util.Random;
import java.lang.Math;

public class Matrix {
    int width;  // M
    int height; // N
    int modulo;

    int[][] content;    // columns contain rows
    public Matrix(int width, int height, int n) throws RuntimeException {
        verifyModuloValidity(n);

        this.width = width;
        this.height = height;
        this.modulo = n;
        this.content = new int[height][width];
        generateMatrix(n);
    }

    public Matrix(int[][] matrix_content, int n) throws RuntimeException{
        verifyModuloValidity(n);

        int lineSize = matrix_content[0].length;
        for (int[] ints : matrix_content) {
            if (ints.length != lineSize)
                throw new RuntimeException("Incompatible line sizes");
        }

        this.content = matrix_content;
        this.height = matrix_content.length;
        this.width = matrix_content[0].length;  // matrix_content[0] always exists since we ask for bidimensional table
        this.modulo = n;
    }

    private void verifyModuloValidity(int n) throws RuntimeException{
        if (n == 0){
            throw new RuntimeException("Can not do mod 0");
        }
    }

    private void generateMatrix(int n) {
        Random rand = new Random();
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                this.content[i][j] = rand.nextInt(n);
            }
        }
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                result += (j == 0 ? "" : " ") + content[i][j] ;
            }
            result += (i == height - 1 ? "" : "\n" );
        }
        return result;
    }

    private int accessAt(int height_index, int width_index){
        if (height_index < this.height && width_index < this.width){
            return this.content[height_index][width_index];
        }
        return 0;
    }


    private Matrix loop(MatrixOperation op, Matrix secondMatrix) throws RuntimeException{
        if (this.modulo != secondMatrix.modulo){
            throw new RuntimeException("Not the same modulo");
        }
        Matrix res = new Matrix(secondMatrix.width, secondMatrix.height,1); // de la même taille que les deux autres
        int maxHeight = Math.max(height, secondMatrix.height);
        int maxWidth = Math.max(width, secondMatrix.width);
        for (int i = 0; i < maxHeight; i++) {
            for (int j = 0; j < maxWidth; j++) {
                int a = this.accessAt(i, j);
                int b = secondMatrix.accessAt(i, j);
                int c = op.apply(a, b, this.modulo);

                res.content[i][j] = c;
            }
        }
        return res;
    }

    public Matrix add(Matrix secondMatrix) throws RuntimeException{
        Addition addOp = new Addition();
        return this.loop(addOp, secondMatrix);
    }

    public Matrix sub(Matrix secondMatrix) throws RuntimeException{
        Subtraction subOp = new Subtraction();
        return this.loop(subOp, secondMatrix);
    }

    public Matrix multiply(Matrix secondMatrix) throws RuntimeException{
        Multiplication mulOp = new Multiplication();
        return this.loop(mulOp, secondMatrix);
    }

}
