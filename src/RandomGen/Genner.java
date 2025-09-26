package RandomGen;

import Calculator.Matrix;

public class Genner {
    public static int[][] genner(int len){
        int[][] a = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }
        return a;
    }
    public static Matrix matrixGenner(int len){
        int[][] a = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }
        return new Matrix(a);
    }




}
