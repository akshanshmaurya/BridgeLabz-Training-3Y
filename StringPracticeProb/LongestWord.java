public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Nice to meet you there";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }

        System.out.println("Longest Word: " + longest);
    }
}
