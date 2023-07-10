import java.util.*;
class TwoDPoint{
    int x, y;
    public TwoDPoint(){
        x=0;
        y=0;
    }
    public TwoDPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates:");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println("Coordinates are ("+x+", "+y+")");
    }
    public void distance(TwoDPoint t1){
        double d;
        d=Math.sqrt(Math.pow((this.x-t1.x), 2)+Math.pow((this.y-t1.y), 2));
        System.out.println("Distance = "+d);
    }
}
class ThreeDPoint extends TwoDPoint{
    int z;
    public ThreeDPoint(){
        x=0;
        y=0;
        z=0;
    }
    public ThreeDPoint(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void setvalues(){
        input();
        Scanner sc=new Scanner(System.in);
        z=sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println("Coordinates are ("+x+", "+y+", "+z+")");
    }
    public void distance(ThreeDPoint t1){
        double d;
        d=Math.sqrt(Math.pow((this.x-t1.x), 2)+Math.pow((this.y-t1.y), 2)+Math.pow((this.z-t1.z), 2));
        System.out.println("Distance = "+d);
    }
}
public class Main {
    public static void main(String[] args) {
        TwoDPoint t2_1=new TwoDPoint(2, 3);
        TwoDPoint t2_2=new TwoDPoint();
        t2_2.input();
        t2_1.display();
        t2_2.display();
        t2_2.distance(t2_1);
        ThreeDPoint t3_1=new ThreeDPoint(2, 3, 4);
        ThreeDPoint t3_2=new ThreeDPoint();
        t3_2.setvalues();
        t3_1.display();
        t3_2.display();
        t3_2.distance(t3_1);
    }
}
