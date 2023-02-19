public class Student {
    public static void main(String args[]) {
        String name=args[0];
        String address=args[1];
        int rollno=Integer.parseInt(args[2]);
        long phno=Long.parseLong(args[3]);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone No.: "+phno);
        System.out.println("Roll No.: "+rollno);
    }
}