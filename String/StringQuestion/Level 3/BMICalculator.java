import java.util.Scanner;

public class BMICalculator {
    public static double calcBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void displayResult(double[][] arr, double[] bmiArr, String[] statusArr) {
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", arr[i][0], arr[i][1], bmiArr[i], statusArr[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][2];
        double[] bmiArr = new double[10];
        String[] statusArr = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Weight(kg) for Person " + (i+1) + ": ");
            arr[i][0] = sc.nextDouble();
            System.out.print("Height(cm) for Person " + (i+1) + ": ");
            arr[i][1] = sc.nextDouble();
            bmiArr[i] = calcBMI(arr[i][0], arr[i][1]);
            statusArr[i] = bmiStatus(bmiArr[i]);
        }
        displayResult(arr, bmiArr, statusArr);
    }
}
