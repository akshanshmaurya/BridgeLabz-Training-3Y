public class StudentGrades {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 40 + (int)(Math.random()*61); // 40-100
        return scores;
    }
    public static char grade(double percent) {
        if (percent >= 90) return 'A';
        if (percent >= 80) return 'B';
        if (percent >= 70) return 'C';
        if (percent >= 60) return 'D';
        return 'F';
    }
    public static void main(String[] args) {
        int n = 5; // number of students
        int[][] scores = generateScores(n);
        System.out.println("Phy\tChem\tMath\tAvg\tGrade");
        for (int[] s : scores) {
            int sum = s[0]+s[1]+s[2];
            double avg = sum/3.0;
            System.out.printf("%d\t%d\t%d\t%.2f\t%c\n", s[0], s[1], s[2], avg, grade(avg));
        }
    }
}
