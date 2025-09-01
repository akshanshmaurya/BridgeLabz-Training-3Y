class MatrixAdvancedOperations {
    public static int[][] createMatrix(int rows,int cols){
        int[][] ar = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                ar[i][j]=(int)(Math.random()*9)+1;
        return ar;
    }
    public static int[][] transpose(int[][] a){
        int[][] t=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                t[j][i]=a[i][j];
        return t;
    }
    public static int determinant2x2(int[][] a){
        return a[0][0]*a[1][1]-a[0][1]*a[1][0];
    }
    public static int determinant3x3(int[][] a){
        int det = a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
                - a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
                + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
        return det;
    }
    public static double[][] inverse2x2(int[][] a){
        double[][] inv = new double[2][2];
        int det = determinant2x2(a);
        inv[0][0]=a[1][1]/(double)det;
        inv[0][1]=-a[0][1]/(double)det;
        inv[1][0]=-a[1][0]/(double)det;
        inv[1][1]=a[0][0]/(double)det;
        return inv;
    }
    public static void print(int[][] a){
        for(int[] row:a){
            for(int x:row) System.out.print(x+" ");
            System.out.println();
        }
    }
    public static void print(double[][] a){
        for(double[] row:a){
            for(double x:row) System.out.printf("%.2f ",x);
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] m2 = createMatrix(2,2);
        int[][] m3 = createMatrix(3,3);
        print(m2); print(transpose(m2));
        System.out.println(determinant2x2(m2));
        print(inverse2x2(m2));
        print(m3); print(transpose(m3));
        System.out.println(determinant3x3(m3));
    }
}
