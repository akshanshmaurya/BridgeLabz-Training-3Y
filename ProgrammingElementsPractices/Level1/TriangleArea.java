import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / (2.54 * 2.54);

        System.out.println("Area of triangle = " + areaCm2 + " cm^2 (" + areaInches2 + " in^2)");
        input.close();
    }
}
