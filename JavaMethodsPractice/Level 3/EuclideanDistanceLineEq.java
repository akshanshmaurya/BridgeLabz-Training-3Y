class EuclideanDistanceLineEq {
    public static double euclidean(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static double[] getSlopeIntercept(int x1,int y1,int x2,int y2){
        double m = (double)(y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }
    public static void main(String[] args){
        int x1=1,y1=1,x2=4,y2=5;
        System.out.println(euclidean(x1,y1,x2,y2));
        double[] mb = getSlopeIntercept(x1,y1,x2,y2);
        System.out.println("Slope: "+mb[0]+" Intercept: "+mb[1]);
    }
}
