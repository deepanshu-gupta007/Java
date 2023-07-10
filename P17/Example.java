public class Example{
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5};
        try{
            int num=arr[-1];
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        try{
            int num=arr[10];
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
        try{
            int num=arr[arr.length];
        } 
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}