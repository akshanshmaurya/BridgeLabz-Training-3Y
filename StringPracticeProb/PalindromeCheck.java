public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "malayalam";
        boolean isPalindrome = true;
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome)
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");
    }
}
