package practice.multithreading;

public class Sample7_SynchronizedTestClass {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
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

        t1.start();
        t2.start();
    }

}

class MultiplicationTable
{
    synchronized public void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}