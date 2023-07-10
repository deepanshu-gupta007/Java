import java.time.*;
import java.time.format.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {       
        LocalDate d=LocalDate.of(2003, 10, 18);
        String day=d.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Day = "+day);
    }
}