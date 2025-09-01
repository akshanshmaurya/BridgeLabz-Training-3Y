import java.util.Scanner;

public class CustomTrim {
    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end > start && text.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String trimmed = trimSpaces(s);
        System.out.println("Manual trim: '" + trimmed + "'");
        System.out.println("Built-in trim: '" + s.trim() + "'");
    }
}
