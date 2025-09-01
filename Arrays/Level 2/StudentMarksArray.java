import java.util.Scanner;

public class StudentMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                physics[i] = sc.nextInt();
                System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                chemistry[i] = sc.nextInt();
                System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                maths[i] = sc.nextInt();
                if (physics[i] >= 0 && chemistry[i] >= 0 && maths[i] >= 0) break;
                System.out.println("Invalid marks. Please enter again.");
            }
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 80) grade[i] = "B";
            else if (percentage[i] >= 70) grade[i] = "C";
            else if (percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(physics[i] + "\t" + chemistry[i] + "\t" + maths[i] + "\t" + percentage[i] + "\t" + grade[i]);
        }
    }
}
