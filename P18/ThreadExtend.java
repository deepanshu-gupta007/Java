class X extends Thread {
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
public class ThreadExtend{
    public static void main(String[] args){
        X t1=new X("Thread 1");
        X t2=new X("Thread 2");
        X t3=new X("Thread 3");
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
