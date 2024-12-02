package practice.exceptionhandling;

public class Sample1_TryCatchSample {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
            String s=null;
            System.out.println(s.length());//NullPointerException
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}
