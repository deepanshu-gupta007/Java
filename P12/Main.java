import java.util.*;
class bank{
    int acno, bal;
    String name, add;
    Scanner sc = new Scanner(System.in);
    void inputinfo() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        add = sc.nextLine();
        System.out.print("Enter balance: ");
        bal = sc.nextInt();
    }
    void acc_no(int x) {
        acno = 1001 + x;
    }
    void deposit() {
        int d;
        System.out.print("Enter amount to be deposited: ");
        d = sc.nextInt();
        bal = bal + d;
    }
    void withdraw() {
        int w;
        System.out.print("Enter amount to be withdraw: ");
        w = sc.nextInt();
        if (w <= bal)
            bal = bal - w;
        else
            System.out.println("Withdraw is not possible");
    }
    void show() {
        System.out.println("-------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + bal);
        System.out.println("-------------------------------------");
    }
    void address() {
        System.out.println("--------------------------------------------");
        System.out.print("Do you want to change the address(Y/N): ");
        sc.nextLine();
        String ch = sc.nextLine();
        if (ch.equals("Y")) {
            System.out.print("New address: ");
            add = sc.nextLine();
        }
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of depositors: ");
        int n = sc.nextInt();
        bank ob[] = new bank[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new bank();
            ob[i].inputinfo();
            ob[i].acc_no(i);
            ob[i].deposit();
            ob[i].withdraw();
            ob[i].address();
            ob[i].show();
        }
        sc.close();
    }
}
