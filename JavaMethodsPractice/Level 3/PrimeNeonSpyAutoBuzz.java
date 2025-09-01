class PrimeNeonSpyAutoBuzz {
    public static boolean isPrime(int n) {
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }
    public static boolean isNeon(int n){
        int sq=n*n, sum=0;
        while(sq>0){ sum+=sq%10;sq/=10; }
        return sum==n;
    }
    public static boolean isSpy(int n){
        int sum=0, prod=1, temp=n;
        while(temp>0){ int d=temp%10;sum+=d;prod*=d;temp/=10; }
        return sum==prod;
    }
    public static boolean isAutomorphic(int n){
        int sq=n*n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }
    public static boolean isBuzz(int n){
        return n%7==0 || n%10==7;
    }
    public static void main(String[] args){
        int n=7;
        System.out.println(isPrime(n));
        System.out.println(isNeon(n));
        System.out.println(isSpy(n));
        System.out.println(isAutomorphic(n));
        System.out.println(isBuzz(n));
    }
}
