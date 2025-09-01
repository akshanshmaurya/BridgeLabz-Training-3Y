import java.util.Scanner;
class MonthCalendar {
    public static String getMonthName(int m) {
        String[] names = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        return names[m-1];
    }
    public static int getDaysInMonth(int y, int m) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2) return (isLeapYear(y) ? 29 : 28);
        return days[m-1];
    }
    public static boolean isLeapYear(int y) {
        if (y%400==0) return true;
        if (y%100==0) return false;
        return y%4==0;
    }
    // Zeller's congruence
    public static int getStartDay(int y, int m) {
        if(m<3) { y--; m+=12; }
        return (1 + ((13*(m+1))/5) + y + (y/4) - (y/100) + (y/400))%7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), year = sc.nextInt();
        System.out.printf("\n   %s %d\n", getMonthName(month), year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int start = getStartDay(year, month);
        int days = getDaysInMonth(year, month);
        for(int i=0;i<start;i++) System.out.print("   ");
        for(int d=1;d<=days;d++){
            System.out.printf("%2d ", d);
            if((d+start)%7==0) System.out.println();
        }
        System.out.println();
        sc.close();
    }
}
