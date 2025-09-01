public class FirstNonRepeating {
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++)
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        return 0; // or any default for not found
    }
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        char ch = firstNonRepeating(s);
        if(ch != 0) System.out.println("First non-repeating: " + ch);
        else System.out.println("No non-repeating character found.");
    }
}
