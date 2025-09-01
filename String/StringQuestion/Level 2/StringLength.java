


import java.util.Scanner;

public class StringLength {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // StringIndexOutOfBounds when end is reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Custom Length: " + customLength(input));
        System.out.println("Built-in Length: " + input.length());
    }
}
