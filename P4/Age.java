import java.util.*;
import java.time.*;
public class Age {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter DOB in YYYY-MM-DD format: ");
        String x=sc.nextLine();
        LocalDate dob=LocalDate.parse(x);
        LocalDate td=LocalDate.now();
        int age=Period.between(dob, td).getYears();
        System.out.println("Age = "+age);
        sc.close();
    }
}
