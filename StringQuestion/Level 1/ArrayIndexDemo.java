
import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // Out of bounds
    }
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        arr[0] = sc.next();
        arr[1] = sc.next();
        // generateException(arr);
        handleException(arr);
    }
}
