package practice.multithreading;

public class YieldSample {
    public static void main(String[] args) {
        MDE md = new MDE();
        new Thread(md).start();
        new Thread(md).start();
        new Thread(md).start();
        new Thread(md).start();
        Thread.yield();
        for (int i = 1; i < 10; i++) {
            System.out.println("From Main thread!!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class MDE implements Runnable  {
    public void run() {
            System.out.println("From MDE!!!");
    }
}
