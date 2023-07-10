import java.util.*;
public class Conversion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        float c=sc.nextFloat();
        float f=1.8f*c+32;
        System.out.println("Fahrenheit = "+f);
        sc.close();
    }
}