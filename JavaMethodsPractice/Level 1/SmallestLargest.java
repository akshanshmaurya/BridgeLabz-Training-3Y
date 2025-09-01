import java.util.Scanner;

class SmallestLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = a, largest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] res = findSmallestAndLargest(n1, n2, n3);
        System.out.println(res[0] + " " + res[1]);
    }
}
