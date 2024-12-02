package practice.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample11_TestThrowSampleTwo {
    //function to check if file is available or not
    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\Users\\banu\\IdeaProjects\\JavaSamplesForLearning\\src\\practice\\exceptionhandling\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);


        throw new FileNotFoundException();

    }
    //main method
    public static void main(String args[]){
        try
        {
            method();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");
    }
}
