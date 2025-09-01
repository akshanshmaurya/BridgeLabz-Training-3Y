public class MonthlyCalendar {
    public static String getMonthName(int m) {
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return names[m-1];
    }
    public static int getDays(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2 && isLeap(y)) return 29;
        return days[m-1];
    }
    public static boolean isLeap(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
    public static int getFirstDay(int y, int m) {
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14-m)/12) - 2;
        return (1 + x + (31*m0)/12) % 7;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt(); int y = sc.nextInt();
        int start = getFirstDay(y,m);
        int days = getDays(m,y);
        System.out.println(getMonthName(m) + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for(int i=0; i<start; i++) System.out.print("   ");
        for(int d=1; d<=days; d++) {
            System.out.printf("%2d ", d);
            if ((d+start)%7==0) System.out.println();
        }
    }
}
