import java.util.Scanner;

public class VowelConsonantCount {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
    public static boolean isLetter(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'a' && c <= 'z');
    }
    public static int[] count(String s) {
        int vowel = 0, consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isLetter(c)) {
                if(isVowel(c)) vowel++;
                else consonant++;
            }
        }
        return new int[]{vowel, consonant};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = count(str);
        System.out.println("Vowels: " + arr[0]);
        System.out.println("Consonants: " + arr[1]);
    }
}
