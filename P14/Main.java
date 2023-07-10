import MyPackage.*;
public class Main {
    public static void main(String[] args) {
        int a, b;
        setdata ob=new setdata();
        ob.inputinfo();
        a=ob.val1();
        b=ob.val2();
        add ob1=new add() {
            public void sum() {
                int res=a+b;
                System.out.println("Sum = "+res);
            }
        };
        ob1.sum();
    }
}
