package Level2;
import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion factors
        double yards = distanceInFeet / 3;        // 1 yard = 3 feet
        double miles = yards / 1760;              // 1 mile = 1760 yards

        // Output
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        sc.close();
}
}
