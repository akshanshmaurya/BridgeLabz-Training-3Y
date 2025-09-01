
import java.util.Scanner;
import java.util.Arrays;

public class CharArrayCompare {
    public static char[] toCharArrayManual(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    public static boolean compareCharArrays(char[] a1, char[] a2) {
        return Arrays.equals(a1, a2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] userArray = toCharArrayManual(text);
        char[] builtInArray = text.toCharArray();
        System.out.println("Equal arrays: " + compareCharArrays(userArray, builtInArray));
    }
}
