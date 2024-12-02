package practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int j = 0; j < 5; j++) {
            Runnable task = new Task1("" + j);
            executorService.execute(task);
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}

class SP
{

}