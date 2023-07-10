import java.util.*;
class employee {
    int taxincome;
    float tax;
    String pan, name;
    Scanner sc=new Scanner(System.in);
    void inputinfo() {
        System.out.print("Enter personal account number: ");
        pan=sc.nextLine();
        System.out.print("Enter store name: ");
        name=sc.nextLine();
        System.out.print("Enter annual taxable income: ");
        taxincome=sc.nextInt();
    }
    void taxcalc() {
        if (taxincome<=250000)
            tax=0;
        else if (taxincome>250000 && taxincome<=300000)
            tax=0.1f*(taxincome-250000);
        else if (taxincome>300000 && taxincome<=400000)
            tax=5000+(0.2f*(taxincome-300000));
        else if (taxincome>400000)
            tax=25000+(0.3f*(taxincome-400000));
    }
    void displayinfo() {
        System.out.println("--------------------------------------");
        System.out.println("Personal Account Number: "+pan);
        System.out.println("Store Name: "+name);
        System.out.println("Annual Taxable Income: "+taxincome);
        System.out.println("Tax: "+tax);
        System.out.println("--------------------------------------");
    }
}
public class Main {
    public static void main(String srgs[]) {
        employee ob=new employee();
        ob.inputinfo();
        ob.taxcalc();
        ob.displayinfo();
    }
}