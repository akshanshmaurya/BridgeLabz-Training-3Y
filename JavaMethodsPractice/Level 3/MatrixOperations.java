import java.util.Random;
class MatrixOperations {
    public static int[][] createMatrix(int rows,int cols){
        int[][] arr = new int[rows][cols];
        Random r = new Random();
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                arr[i][j]=r.nextInt(10);
        return arr;
    }
    public static int[][] add(int[][] a, int[][] b){
        int[][] res = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    public static int[][] subtract(int[][] a, int[][] b){
        int[][] res = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int[][] res = new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<b[0].length;j++)
                for(int k=0;k<a[0].length;k++)
                    res[i][j] += a[i][k]*b[k][j];
        return res;
    }
    public static void print(int[][] mat){
        for(int[] row:mat){
            for(int a:row) System.out.print(a+" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] a = createMatrix(2,2);
        int[][] b = createMatrix(2,2);
        print(a); System.out.println("+"); print(b); System.out.println("=");
        print(add(a,b));
        System.out.println("-");
        print(subtract(a,b));
        System.out.println("*");
        print(multiply(a,b));
    }
}
