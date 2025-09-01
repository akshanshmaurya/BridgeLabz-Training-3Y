class NumberChecker {
    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) { c++; n /= 10; }
        return c;
    }
    public static int[] getDigits(int n) {
        int len = countDigits(n);
        int[] arr = new int[len];
        for (int i = len-1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }
    public static boolean isDuck(int[] d) {
        for (int i : d) if (i == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int[] d) {
        int pow = d.length, sum = 0;
        for (int i : d) sum += Math.pow(i, pow);
        int n = 0;
        for (int i : d) n = n * 10 + i;
        return n == sum;
    }
    public static int[] twoLargest(int[] d) {
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE;
        for (int i : d) {
            if (i > m1) { m2 = m1; m1 = i; }
            else if (i > m2 && i != m1) m2 = i;
        }
        return new int[]{m1, m2};
    }
    public static int[] twoSmallest(int[] d) {
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
        for (int i : d) {
            if (i < s1) { s2 = s1; s1 = i; }
            else if (i < s2 && i != s1) s2 = i;
        }
        return new int[]{s1, s2};
    }
    public static void main(String[] args) {
        int n = 153;
        int[] d = getDigits(n);
        System.out.println("Duck: " + isDuck(d));
        System.out.println("Armstrong: " + isArmstrong(d));
        int[] l = twoLargest(d);
        System.out.println(l[0] + " " + l[1]);
        int[] s = twoSmallest(d);
        System.out.println(s[0] + " " + s[1]);
    }
}
