package practice.exceptionhandling;

public class Sample14_MyExceptionTestSample {
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("Exception from main function!");
        }
        catch (MyException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Caught");

        }
    }
}

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}