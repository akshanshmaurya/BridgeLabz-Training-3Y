class OtpGenerator {
    public static int generateOtp() {
        return (int)(Math.random()*900000) + 100000;
    }
    public static boolean areUnique(int[] arr) {
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]==arr[j]) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for(int i=0;i<10;i++) otps[i]=generateOtp();
        boolean allUnique = areUnique(otps);
        for(int n:otps) System.out.print(n+" ");
        System.out.println("\n"+allUnique);
    }
}
