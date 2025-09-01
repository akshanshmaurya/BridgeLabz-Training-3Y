import java.util.Scanner;

public class StudentMarks2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                marks[i][0] = sc.nextInt();
                System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                marks[i][1] = sc.nextInt();
                System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                marks[i][2] = sc.nextInt();
                if (marks[i][0] >= 0 && marks[i][1] >= 0 && marks[i][2] >= 0) break;
                System.out.println("Invalid marks. Please enter again.");
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 80) grade[i] = "B";
            else if (percentage[i] >= 70) grade[i] = "C";
            else if (percentage[i] >= 60) grade[i] = "D";
            else grade[i] = "F";
        }
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + percentage[i] + "\t" + grade[i]);
        }
    }
}
