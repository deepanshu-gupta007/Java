import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a month number: ");
        int m=sc.nextInt();
        System.out.print("Input a year: ");
        int y=sc.nextInt();
        int d=YearMonth.of(y, m).lengthOfMonth();
        String mon=Month.of(m).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(mon+" "+y+" has "+d+" days");
        sc.close();
    }
}
