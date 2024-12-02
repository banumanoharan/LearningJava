package practice.multithreading;

public class Sample5_RunnableImplementationSamples {
    public static void main(String[] args) {//Thread 1
        //Option 1
        AIA a1 = new AIA();
    //  a1.run();

        //Option 2
        Thread t1 = new Thread(a1);
       // t1.start();

        //Option 3 - Anonymous class
        Runnable rThread1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("From Anonymous class!");
                }
            }
        };
       // rThread1.run();
        Thread t11 = new Thread(rThread1);
        t11.start();//Thread 2

        //Option 3 - Lambda expression ()->{}
        Runnable rThread2 = () -> {
            for (int i = 1; i <= 5; i++) {
                    System.out.println("From Lambda expression!");
                }
        };
        rThread2.run();//Thread 3
        Thread t12 = new Thread(rThread2);
        t12.start();//Thread 4
    }

}

class AIA implements Runnable  {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("4424365 ABCD2");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}