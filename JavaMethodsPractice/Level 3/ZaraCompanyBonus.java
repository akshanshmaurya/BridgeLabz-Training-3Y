class ZaraCompanyBonus {
    public static int[][] getSalariesYears(){
        int[][] arr = new int[10][2];
        for(int i=0;i<10;i++){
            arr[i][0]=(int)(Math.random()*90000)+10000;
            arr[i][1]=(int)(Math.random()*10)+1; // 1 to 10
        }
        return arr;
    }
    public static double[][] calculateNewSalaries(int[][] employees){
        double[][] result = new double[10][2];
        for(int i=0;i<10;i++){
            double bonus = employees[i][1]>5 ? employees[i][0]*0.05 : employees[i][0]*0.02;
            result[i][0]=employees[i][0]+bonus;
            result[i][1]=bonus;
        }
        return result;
    }
    public static void main(String[] args){
        int[][] base = getSalariesYears();
        double[][] newer = calculateNewSalaries(base);
        double totalOld=0,totalNew=0,totalBonus=0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        for(int i=0;i<10;i++){
            totalOld+=base[i][0];
            totalNew+=newer[i][0];
            totalBonus+=newer[i][1];
            System.out.printf("%2d\t%8d\t%2d\t%8.2f\t%10.2f\n",i+1,base[i][0],base[i][1],newer[i][1],newer[i][0]);
        }
        System.out.printf("Sum\t%8.2f\t\t%8.2f\t%10.2f\n", totalOld,totalBonus,totalNew);
    }
}
