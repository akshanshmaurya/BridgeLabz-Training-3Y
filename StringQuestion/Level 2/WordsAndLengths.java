
import java.util.Scanner;

public class WordsAndLengths {
    public static String[] splitWords(String text) {
        // Reuse customSplit from previous code
        return text.trim().split("\\s+");
    }

    public static int getLength(String s) {
        int len = 0;
        try { while (true) { s.charAt(len++); } } catch (Exception e) {}
        return len;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] out = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            out[i][0] = words[i];
            out[i][1] = String.valueOf(getLength(words[i]));
        }
        return out;
    }

    public static void display(String[][] arr) {
        System.out.println("Word\tLength");
        for (String[] a : arr)
            System.out.println(a[0] + "\t" + a[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = splitWords(line);
        String[][] result = wordsWithLengths(words);
        display(result);
    }
}
