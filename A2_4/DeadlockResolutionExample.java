public class DeadlockResolutionExample{
    private static Object r1=new Object();
    private static Object r2=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized(r1) {
                System.out.println("Thread 1: Resource 1");
                try {
                    Thread.sleep(100);
                } 
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(r2){
                    System.out.println("Thread 1: Resource 2");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized(r1){
                System.out.println("Thread 2: Resource 1");
                try {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (r2) {
                    System.out.println("Thread 2: Resource 2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}