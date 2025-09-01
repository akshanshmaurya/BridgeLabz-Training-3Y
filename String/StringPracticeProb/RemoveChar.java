public class RemoveChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch)
                sb.append(c);
        }

        System.out.println("Modified String: " + sb.toString());
    }
}
