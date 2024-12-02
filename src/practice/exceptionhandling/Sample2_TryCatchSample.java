package practice.exceptionhandling;

public class Sample2_TryCatchSample {
    public static void main(String args[]){
        try{
           int data=100/0;
        }catch(ArithmeticException e)
        {System.out.println(e);}
        System.out.println("rest of the code...");
    }
}
