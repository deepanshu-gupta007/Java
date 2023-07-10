class X implements Runnable{
    private String x;
    public X(String x) {
        this.x=x;
    }
    public void run() {
        try{
            System.out.println("Thread is complete "+x);
            System.out.println("Thread is finished "+x);
        }
        catch(Exception e){
            System.out.println("Exception occurs: "+e);
        }
    }
}
public class ThreadImp{
    public static void main(String[] args){
        Thread t1=new Thread(new X("Thread 1"));
        Thread t2=new Thread(new X("Thread 2"));
        Thread t3=new Thread(new X("Thread 3"));
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        } 
        catch (InterruptedException e){
            System.out.println("Error: "+e);
        }
        System.out.println("All threads have finished.");
    }
}