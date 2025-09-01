import java.util.Scanner;

class ParkRounds {
    public static double computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = computeRounds(side1, side2, side3);
        System.out.println(rounds);
    }
}
