package ch.heigvd.poo;


import java.util.Random;
import java.lang.Math;

class Dad{


    public void dosmth(Matrix second){

    }

}

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
    public Matrix(int[][] matrix){
        this.content = matrix;

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
    public void displayMatrix(){
        System.out.println("Displaying Matrix");
        for (int i = 0; i < height; i++){
            System.out.print("[");
            for (int j = 0; j < width; j++){
                System.out.print(content[i][j]);
                if (j < width - 1)
                    System.out.print(" ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
    }

    public void iterateOverMatrix(){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){

            }
        }
    }

    public void add(Matrix secondMatrix) throws RuntimeException{
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){

            }
        }


    }
    public void substract(Matrix secondMatrix){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                this.content[i][j] -= secondMatrix.content[i][j];
            }
        }
    }
    public void multiply(Matrix secondMatrix){

    }
}
