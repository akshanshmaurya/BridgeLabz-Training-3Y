import java.util.Scanner;

class ChocolateDistributor {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child: " + res[1] + " Remaining: " + res[0]);
    }
}
