class Table extends Thread{
    synchronized void printTable(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    Thread t1=new Thread(){
        public void run(){
            printTable(5);
        }
    };
    Thread t2=new Thread(){
        public void run(){
            printTable(100);
        }
    };
}
public class Main {
    public static void main(String[] args) {
        Table obj=new Table();
        obj.t1.start();
        obj.t2.start();
    }
}
