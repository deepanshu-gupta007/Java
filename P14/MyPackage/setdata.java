package MyPackage;
import java.util.*;
public class setdata {
    int a, b;
    public void inputinfo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements: ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
    }
    public int val1(){
        return a;
    }
    public int val2(){
        return b;
    }
}