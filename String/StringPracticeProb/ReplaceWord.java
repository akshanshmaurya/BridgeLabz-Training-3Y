public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "I love Java programming";
        String oldWord = "Java";
        String newWord = "Python";

        String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
