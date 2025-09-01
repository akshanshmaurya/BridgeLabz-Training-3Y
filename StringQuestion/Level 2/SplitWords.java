
import java.util.Scanner;
import java.util.Arrays;

public class SplitWords {
    public static String[] customSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int index = 0, start = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] userWords = customSplit(line);
        String[] builtIn = line.split(" ");
        System.out.println("Equal: " + compareArrays(userWords, builtIn));
    }
}
