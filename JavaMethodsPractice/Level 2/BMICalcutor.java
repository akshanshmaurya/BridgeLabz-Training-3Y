import java.util.Scanner;

class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[10][3];
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
            arr[i][2] = calculateBMI(arr[i][0], arr[i][1]);
            status[i] = getStatus(arr[i][2]);
        }
        for (int i = 0; i < 10; i++)
            System.out.printf("Person %d: Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s\n", i+1, arr[i][1], arr[i][0], arr[i][2], status[i]);
    }
}
