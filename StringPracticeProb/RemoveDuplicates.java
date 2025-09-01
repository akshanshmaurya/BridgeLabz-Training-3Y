import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "helloworld";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
