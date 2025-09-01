package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight (kg) and height (cm)
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = input.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100.0;

        // BMI formula
        double bmi = weight / (heightM * heightM);

        // Display result
        System.out.printf("BMI = %.2f%n", bmi);

        // Weight status
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
