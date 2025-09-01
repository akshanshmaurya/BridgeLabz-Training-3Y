import java.util.Scanner;

class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = isLeapYear(year);
        if (leap)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
