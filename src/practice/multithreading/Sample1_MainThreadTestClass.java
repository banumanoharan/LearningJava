package practice.multithreading;

public class Sample1_MainThreadTestClass {
    public static void main(String[] args) {
       ABCD ab = new ABCD();
       Runnable ma = new MCCA();
       ab.start();
       Thread t1 = new Thread(ma);
       t1.start();

        if(ab.isAlive())
            System.out.println("AB thread is functioning!");
        else
            System.out.println("AB thread has completed its task!");

       Runnable runnableThread1 = new Runnable() {
           @Override
           public void run() {
               for (int i = 1; i <= 5; i++) {
                   System.out.println("From anonymous Runnable thread 1!!!");
                   try {
                       Thread.sleep(4000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       };
        Thread t2 = new Thread(runnableThread1);
        t2.start();


        Runnable runnableThread2 = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("From anonymous Runnable thread 2!!!");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        Thread t3 = new Thread(runnableThread2);
        t3.start();

        runnableThread2.run();


        try {
            ab.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main thread!!");

        if(ab.isAlive())
            System.out.println("AB thread is functioning!");
        else
            System.out.println("AB thread has completed its task!");

    }

}
class ABCD extends Thread
{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Am ABCD!!!");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MCCA implements Runnable
{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4365 MCCA!!!");
        }
    }
}