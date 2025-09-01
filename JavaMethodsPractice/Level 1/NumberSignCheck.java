import java.util.Scanner;

class NumberSignCheck {
    public static int checkSign(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = checkSign(num);
        System.out.println(result);
    }
}
