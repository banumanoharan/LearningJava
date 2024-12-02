package practice.multithreading;

public class InterruptMethodSample {
    public static void main(String[] args) {
        ABRSP ab = new ABRSP();
        ab.start();
        try {
            ab.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of main thread!");

    }

}
class ABRSP extends Thread
{
    public void run()
    {
         for (int i = 1; i <= 5; i++) {
            System.out.println("From ABR class!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Am interrupted!");
            }
        }
    }
}