public class UniqueCharacters {
    public static int customLength(String s) {
        int count = 0;
        try { while(true) { s.charAt(count++); } }
        catch(Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String text) {
        int len = customLength(text);
        char[] temp = new char[len];
        int size = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < size; j++)
                if (temp[j] == c) { found = true; break; }
            if (!found) temp[size++] = c;
        }
        char[] res = new char[size];
        for (int i = 0; i < size; i++) res[i] = temp[i];
        return res;
    }
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        char[] unique = uniqueChars(s);
        for(char c : unique) System.out.print(c + " ");
    }
}
