import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int x=sc.nextInt();
        for(int i=1; i<=x; i++) {
            for(int j=x; j>i; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print(i+" ");
            System.out.println();
        }
        sc.close();
    }
}