import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int x=sc.nextInt();
        for(int i=1; i<=x; i++)
            System.out.println("Number is: "+i+" and cube of "+i+" is: "+(i*i*i));
            sc.close();
    }
}
