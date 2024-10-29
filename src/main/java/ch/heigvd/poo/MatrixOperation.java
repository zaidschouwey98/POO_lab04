package ch.heigvd.poo;
import java.lang.Math;


abstract class MatrixOperation {
    public abstract int apply(int a, int b, int modulo);
}

class Addition extends MatrixOperation{
    public int apply(int a, int b, int modulo){
        return Math.floorMod(a + b, modulo);
    }
}

class Subtraction extends MatrixOperation{
    public int apply(int a, int b, int modulo){
        return Math.floorMod(a - b, modulo);
    }
}

class Multiplication extends MatrixOperation{
    public int apply(int a, int b, int modulo){
        return Math.floorMod(a * b, modulo);

    }
}
