class RevPalindromeDuck {
    public static int[] digits(int n){
        int[] arr = new int[(int)Math.log10(n)+1];
        for(int i=arr.length-1;i>=0;i--){ arr[i]=n%10;n/=10;}
        return arr;
    }
    public static int[] reverse(int[] arr){
        int[] rev = new int[arr.length];
        for(int i=0;i<arr.length;i++) rev[i]=arr[arr.length-1-i];
        return rev;
    }
    public static boolean isPalindrome(int[] arr,int[] rev){
        for(int i=0;i<arr.length;i++) if(arr[i] != rev[i]) return false;
        return true;
    }
    public static boolean isDuck(int[] arr){ for(int x:arr) if(x==0) return true; return false; }
    public static void main(String[] args){
        int n=121;
        int[] d=digits(n), r=reverse(d);
        System.out.println(isPalindrome(d,r));
        System.out.println(isDuck(d));
    }
}
