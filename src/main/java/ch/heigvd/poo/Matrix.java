package ch.heigvd.poo;

import java.util.Random;
import java.lang.Math;

public class Matrix {
    int width;  // M
    int height; // N
    int modulo;

    int[][] content;    // columns contain rows
    public Matrix(int width, int height, int n) {
        this.width = width;
        this.height = height;
        this.modulo = n;
        this.content = new int[height][width];
        generateMatrix(n);
    }

    public Matrix(int[][] matrix, int n){
        this.content = matrix;
        this.height = matrix.length;
        this.width = matrix[0].length;
        this.modulo = n;
    }

    private void generateMatrix(int n) {
        Random rand = new Random();
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                this.content[i][j] = rand.nextInt(n);
            }
        }
    }
    // Improve this so that it has a pretty print even if the values don't have the same digit number
    /*
    public void displayMatrix(){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(content[i][j]);
                if (j < width - 1)
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
     */

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


    private Matrix loop(MatrixOperation op, Matrix secondMatrix){
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
