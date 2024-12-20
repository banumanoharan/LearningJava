package practice.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Sample17_TryWithMultipleResourcesSample {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (scanner.hasNext()) {
                writer.print(scanner.nextLine());
            }}
        catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                System.out.println("In finally block!");
            }
    }
}
