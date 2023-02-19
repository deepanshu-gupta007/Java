public class Palindrome {
    public static void main(String args[]) {
        String rev="";
        for(int i=args[0].length()-1; i>=0; i--)
            rev=rev+args[0].charAt(i);
        if (args[0].equals(rev))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
