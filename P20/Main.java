class Customer{
    int amt=10000;
    synchronized void withdraw(int money){
        System.out.println("Withdraw");
        if(amt<money){
            System.out.println("Less balance");
            try{
                wait();
            }
            catch(Exception e){}
        }
        amt=amt-money;
        System.out.println("Withdraw complete");
        System.out.println("Updated balance="+amt);
    }
    synchronized void deposit(int money){
        System.out.println("Deposit");
        amt=amt+money;
        System.out.println("Deposit complete");
        notify();
    }
}
class T1 extends Thread{
    Customer c;
    T1(Customer c){
        this.c=c;
    }
    public void run(){
        c.withdraw(15000);
    }
}
class T2 extends Thread{
    Customer c;
    T2(Customer c){
        this.c=c;
    }
    public void run(){
        c.deposit(10000);
    }
}
public class Main {
    public static void main(String[] args) {
        Customer c=new Customer();
        T1 ob1=new T1(c);
        T2 ob2=new T2(c);
        ob1.start();
        ob2.start();
    }
}
