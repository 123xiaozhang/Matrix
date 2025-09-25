package Calculator;

public class Matrix {






    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public int[][] matrix;



    public Matrix(int[][] matrix) {this.matrix = matrix;}


    public int getdet(){
        return Matrix.det(this.matrix);
    }




    public static int det(int[][] a){
        int determinant = 0;
        if(a==null || a.length==0 || a.length != a[0].length){return 0;}
        if(a.length == 1){return a[0][0];}
        if(a.length == 2){return a[0][0]*a[1][1]-a[0][1]*a[1][0];}
        int len = a.length;



        for (int i = 0; i < len; i++) {

            int[][] sonMatrix = new int[len - 1][len - 1];
            for (int j = 0; j < len - 1; j++) {
                if(j<i){
                    for (int k = 0; k < len - 1; k++) {
                        sonMatrix[j][k] = a[j][k+1];
                    }
                }else{
                    for (int k = 0; k < len - 1; k++) {
                        sonMatrix[j][k] = a[j+1][k+1];
                    }
                }
            }

            determinant = determinant + a[i][0]*det(sonMatrix)*(Matrix.pow(-1,i));

        }





        return determinant;
    }

    static int pow (int base,int times){
        if(times==0){return 1;}
        if(times < 0){return 0;}
        return base*Matrix.pow(base,times-1);
    }


}
