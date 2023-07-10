import java.util.*;
public class Area {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all sides: ");
        float a=sc.nextFloat(), b=sc.nextFloat(), c=sc.nextFloat();
        float s=a+b+c;
        double area=Math.pow((double)(s*(s-a)*(s-b)*(s-c)), (double)1/2);
        System.out.println("Area = "+area+" units square");
        sc.close();
    }
}