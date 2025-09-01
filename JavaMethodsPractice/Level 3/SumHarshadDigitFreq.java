class SumHarshadDigitFreq {
    public static int[] digits(int n){
        int[] arr = new int[(int)Math.log10(n)+1];
        for(int i=arr.length-1;i>=0;i--){ arr[i]=n%10;n/=10; }
        return arr;
    }
    public static int sum(int[] arr){ int s=0;for(int v:arr)s+=v;return s;}
    public static int sumSquares(int[] arr){ int s=0;for(int v:arr)s+=v*v;return s; }
    public static boolean isHarshad(int n,int sum){ return n%sum==0; }
    public static int[][] frequency(int[] arr){
        int[][] freq = new int[10][2];
        for(int i=0;i<10;i++) freq[i][0]=i;
        for(int v:arr) freq[v][1]++;
        return freq;
    }
    public static void main(String[] args) {
        int n=21;
        int[] d=digits(n);
        int digitSum=sum(d);
        System.out.println(sum(d));
        System.out.println(sumSquares(d));
        System.out.println(isHarshad(n,digitSum));
        int[][] freq=frequency(d);
        for(int[] f:freq) if(f[1]>0) System.out.println(f[0]+" "+f[1]);
    }
}
