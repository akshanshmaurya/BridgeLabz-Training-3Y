
import java.util.Scanner;

public class UpperCaseDemo {
    public static String toUpperCaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String manual = toUpperCaseManual(text);
        String builtIn = text.toUpperCase();
        System.out.println("Manual upper: " + manual);
        System.out.println("Built-in upper: " + builtIn);
        System.out.println("Equal: " + compareStrings(manual, builtIn));
    }
}
