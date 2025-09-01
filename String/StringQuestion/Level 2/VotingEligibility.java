public class VotingEligibility {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = 10 + (int)(Math.random()*16); // Random age between 10 and 25
        return ages;
    }
    public static boolean canVote(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        System.out.println("Age\tCan Vote");
        for (int age : ages)
            System.out.println(age + "\t" + canVote(age));
    }
}
