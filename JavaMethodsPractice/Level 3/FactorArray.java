class FactorsArray {
    public static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] arr = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) arr[idx++] = i;
        return arr;
    }
    public static int max(int[] arr) {
        int m = arr[0];
        for (int v : arr) if (v > m) m = v;
        return m;
    }
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }
    public static int product(int[] arr) {
        int p = 1;
        for (int v : arr) p *= v;
        return p;
    }
    public static double productOfCubes(int[] arr) {
        double p = 1;
        for (int v : arr) p *= Math.pow(v, 3);
        return p;
    }
    public static void main(String[] args) {
        int n = 12;
        int[] arr = factors(n);
        System.out.println(max(arr));
        System.out.println(sum(arr));
        System.out.println(product(arr));
        System.out.println(productOfCubes(arr));
    }
}
