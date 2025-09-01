
import java.util.Scanner;

public class SubstringCompare {
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String s1 = substringUsingCharAt(text, start, end);
        String s2 = text.substring(start, end);
        System.out.println("Substring (charAt): " + s1);
        System.out.println("Substring (substring): " + s2);
        System.out.println("Equal: " + compareStrings(s1, s2));
    }
}
