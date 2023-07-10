import java.util.*;
public class Area {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base and Height: ");
        float b=sc.nextFloat();
        float h=sc.nextFloat();
        float area=0.5f*b*h;
        System.out.println("Area = "+area+" units square");
        sc.close();
    }
}