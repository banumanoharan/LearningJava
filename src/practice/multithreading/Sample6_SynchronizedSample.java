package practice.multithreading;

public class SynchronizedSample {
    public static void main(String[] args) {
        MTable mt = new MTable();
        Thread t1 = new Thread(){
            public void run(){
                mt.printTable(7);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                mt.printTable(13);
            }
        };
        Thread t3 = new Thread(){
            public void run(){
                mt.printTable(11);
            }
        };

        t3.start();
        t2.start();
        t1.start();
        }
    }

class MTable
{
    synchronized public void printTable(int n)
    {
        for(int i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+(n*i));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}