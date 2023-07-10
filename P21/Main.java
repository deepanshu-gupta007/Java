class Table{
    synchronized void printTable(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
        }
    }
}
public class Main extends Thread{
    public static void main(String[] args) {
        Table obj=new Table();
        Thread t1=new Thread(){
            public void run(){
                obj.printTable(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
