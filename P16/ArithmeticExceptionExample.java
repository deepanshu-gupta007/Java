public class ArithmeticExceptionExample{
    public static void main(String[] args){
        int a=10;
        int b=0;
        try{
            int result=a/b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        int c=Integer.MAX_VALUE;
        int d=2;
        try{
            int result=c*d;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        double x=10.0;
        double y=0.0;
        try{
            double result=x/y;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        int g=10;
        int h=0;
        try{
            int result=g%h;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        double i=2.0;
        double j=-3.0;
        try{
            double result=Math.pow(i, j);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}