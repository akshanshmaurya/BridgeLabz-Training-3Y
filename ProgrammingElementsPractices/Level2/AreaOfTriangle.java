package Level2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for base and height
        System.out.print("Enter base of the triangle (cm): ");
        double base = sc.nextDouble();
        
        System.out.print("Enter height of the triangle (cm): ");
        double height = sc.nextDouble();
        
        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;
        
        // Convert area to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 * 2.54) sq cm
        double areaIn = areaCm / (2.54 * 2.54);
        
        // Display result
        System.out.println("\n---- Triangle Area ----");
        System.out.println("The Area of the triangle in sq cm is: " + areaCm);
        System.out.println("The Area of the triangle in sq in is: " + areaIn);
        
        sc.close();
    }
}
