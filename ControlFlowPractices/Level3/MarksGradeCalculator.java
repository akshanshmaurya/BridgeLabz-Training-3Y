package BridgeLabz.ControlFlowPractices.Level3;

import java.util.Scanner;

class MarksGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics marks (0-100): ");
        double physics = input.nextDouble();
        System.out.print("Enter Chemistry marks (0-100): ");
        double chemistry = input.nextDouble();
        System.out.print("Enter Maths marks (0-100): ");
        double maths = input.nextDouble();

        if (!isValid(physics) || !isValid(chemistry) || !isValid(maths)) {
            System.out.println("Invalid marks. Please enter values between 0 and 100.");
            input.close();
            return;
        }

        double percentage = (physics + chemistry + maths) / 3.0;

        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        System.out.printf("Average: %.2f%% | Grade: %s | Remarks: %s%n", 
                          percentage, grade, remarks);

        input.close();
    }

    private static boolean isValid(double m) {
        return m >= 0 && m <= 100;
    }
}

