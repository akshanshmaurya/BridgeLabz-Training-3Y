public class UniqueCharFrequency {
    public static char[] uniqueChars(String text) {
        int len = text.length();
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
        char[] uniq = uniqueChars(s);
        for(char c : uniq) {
            int count = 0;
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == c) count++;
            System.out.println(c + ": " + count);
        }
    }
}
