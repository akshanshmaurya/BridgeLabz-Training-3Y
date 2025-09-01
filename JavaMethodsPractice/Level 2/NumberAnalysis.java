import java.util.Scanner;

class NumberAnalysis {
    public static boolean isPositive(int num) { return num > 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        if (n1 == n2) return 0;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for (int n : arr)
            if (isPositive(n)) {
                System.out.println((isEven(n) ? "Even" : "Odd") + " and Positive");
            } else {
                System.out.println("Negative");
            }
        int cmp = compare(arr[0], arr[4]);
        if (cmp == 1)
            System.out.println("First is Greater");
        else if (cmp == 0)
            System.out.println("Equal");
        else
            System.out.println("First is Less");
    }
}
