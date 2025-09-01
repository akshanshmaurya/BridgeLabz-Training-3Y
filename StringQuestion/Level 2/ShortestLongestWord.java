
import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitWords(String text) {
        return text.trim().split("\\s+");
    }

    public static String shortest(String[] words) {
        String min = words[0];
        for (String w : words) if (w.length() < min.length()) min = w;
        return min;
    }
    public static String longest(String[] words) {
        String max = words[0];
        for (String w : words) if (w.length() > max.length()) max = w;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = splitWords(line);
        System.out.println("Shortest: " + shortest(words));
        System.out.println("Longest: " + longest(words));
    }
}
