class LevelOneException extends Exception{
    public LevelOneException(){
        System.out.println("Level One Exception");
    }
}
class LevelTwoException extends LevelOneException{
    public LevelTwoException(){
        System.out.println("Level Two Exception");
    }
}
class LevelThreeException extends LevelTwoException{
    public LevelThreeException(){
        System.out.println("Level Three Exception");
    }
}
class A{
    public void method() throws LevelOneException{
        throw new LevelOneException();
    }
}
class B extends A{
    public void method() throws LevelTwoException{
        throw new LevelTwoException();
    }
}
class C extends B{
    public void method() throws LevelThreeException{
        throw new LevelThreeException();
    }
}
public class Main{
    public static void main(String[] args){
        A obj=new C();
        try{
            obj.method();
        } 
        catch (LevelOneException e){
            System.out.println("Caught Level One Exception");
        }
    }
}
