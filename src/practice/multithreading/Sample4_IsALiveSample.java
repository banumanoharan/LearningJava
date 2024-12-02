package practice.multithreading;

public class Sample4_IsALiveSample {
    public static void main(String[] args) {
        ABR abr = new ABR();
        if(abr.isAlive())
            System.out.println("Thread ABR is functioning!");
        else
            System.out.println("Thread ABR is not functioning!");
        abr.start();
        if(abr.isAlive())
            System.out.println("Thread ABR is functioning!");
        else
            System.out.println("Thread ABR is not functioning!");


        for (int i = 1; i <= 5; i++) {
            System.out.println("From Main Thread!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        if(abr.isAlive())
            System.out.println("Thread ABR is functioning!");
        else
            System.out.println("Thread ABR is not functioning!");
    }
}
class ABR extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) {
        System.out.println("From ABR class!");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}