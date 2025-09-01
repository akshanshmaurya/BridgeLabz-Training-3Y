
import java.util.Scanner;

public class LowerCaseDemo {
    public static String toLowerCaseManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
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
        String manual = toLowerCaseManual(text);
        String builtIn = text.toLowerCase();
        System.out.println("Manual lower: " + manual);
        System.out.println("Built-in lower: " + builtIn);
        System.out.println("Equal: " + compareStrings(manual, builtIn));
    }
}

