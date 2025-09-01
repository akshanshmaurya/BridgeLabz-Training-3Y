public class FrequencyNestedLoop {
    public static void main(String[] args) {
        String s = new java.util.Scanner(System.in).nextLine();
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
            for (int j = 0; j < i; j++)
                if (arr[j] == arr[i]) freq[i] = 0;
            for (int j = i+1; j < len; j++)
                if (arr[j] == arr[i]) freq[i]++;
        }
        for (int i = 0; i < len; i++)
            if (freq[i] != 0) System.out.println(arr[i] + ": " + freq[i]);
    }
}
