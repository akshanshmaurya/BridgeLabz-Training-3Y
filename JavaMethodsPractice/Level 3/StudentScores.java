class StudentScores {
    public static int[][] getScores(int n){
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                arr[i][j]=(int)(Math.random()*51)+50;
        return arr;
    }
    public static double[][] scoreStats(int[][] arr){
        double[][] data = new double[arr.length][3];
        for(int i=0;i<arr.length;i++){
            int total = arr[i][0]+arr[i][1]+arr[i][2];
            double avg = total/3.0;
            double per = total/3.0;
            data[i][0]=Math.round(total*100.0)/100.0;
            data[i][1]=Math.round(avg*100.0)/100.0;
            data[i][2]=Math.round((per)*100.0)/100.0;
        }
        return data;
    }
    public static void printScorecard(int[][] arr, double[][] stats){
        System.out.println("P\tC\tM\tTotal\tAverage\tPercent");
        for(int i=0;i<arr.length;i++)
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",arr[i][0],arr[i][1],arr[i][2],stats[i][0],stats[i][1],stats[i][2]);
    }
    public static void main(String[] args){
        int n=5;
        int[][] marks = getScores(n);
        double[][] stats = scoreStats(marks);
        printScorecard(marks,stats);
    }
}
