public class Comp {
    public static void main(String args[]) {
        float p=Float.parseFloat(args[0]);
        float r=Float.parseFloat(args[1]);
        float n=Float.parseFloat(args[2]);
        float t=Float.parseFloat(args[3]);
        float x=(1+(r/n)/100), y=1, z=n*t;
        for(float i=1; i<=z; i++)
            y=y*x;
        float ci=p*(y-1);
        System.out.println("Compound Interest = "+ci);
    }
}
