import java.util.*;
public class Datatype {
    public static void main(String args[]) {
        System.out.println("Datatype\tSize\t\tRange");
        System.out.println("byte\t\t"+(Byte.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Byte.SIZE-1))+" to "+(Math.pow(2, (Byte.SIZE-1))-1));
        System.out.println("short\t\t"+(Short.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Short.SIZE-1))+" to "+(Math.pow(2, (Short.SIZE-1))-1));
        System.out.println("int\t\t"+(Integer.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Integer.SIZE-1))+" to "+(Math.pow(2, (Integer.SIZE-1))-1));
        System.out.println("long\t\t"+(Long.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Long.SIZE-1))+" to "+(Math.pow(2, (Long.SIZE-1))-1));
        System.out.println("float\t\t"+(Float.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Float.SIZE-1))+" to "+(Math.pow(2, (Float.SIZE-1))-1));
        System.out.println("double\t\t"+(Double.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Double.SIZE-1))+" to "+(Math.pow(2, (Double.SIZE-1))-1));
        System.out.println("char\t\t"+(Character.SIZE/8)+" bytes\t\t-"+Math.pow(2, (Character.SIZE-1))+" to "+(Math.pow(2, (Character.SIZE-1))-1));
    }   
}