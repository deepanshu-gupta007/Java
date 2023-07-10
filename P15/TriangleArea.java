import java.util.Scanner;
class Triangle {
    private double base;
    private double height;
    public Triangle(double b, double h){
        base=b;
        height=h;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
public class TriangleArea {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double base, height;
        try{
            System.out.print("Enter the base of the triangle: ");
            base=sc.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            height=sc.nextDouble();
            Triangle triangle=new Triangle(base, height);
            double area=triangle.getArea();
            System.out.println("The area of the triangle is "+area);
        } 
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}