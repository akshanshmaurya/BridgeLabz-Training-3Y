

import java.util.Scanner;

public class StringIndexExceptionDemo {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Out of bounds
    }
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // generateException(input);
        handleException(input);
    }
}
