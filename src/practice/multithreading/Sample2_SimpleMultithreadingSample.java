package practice.multithreading;

import java.util.Set;

public class Sample2_SimpleMultithreadingSample {
    public static void main(String[] args) {//Thread 1

        ABCD1 ab1 = new ABCD1();
        ABCD2 ab2 = new ABCD2();
        // ab1.show();
        // ab1.start();//Thread 2
        //  ab2.run();//Thread 3
        Thread t1 = new Thread(ab2);
        //   t1.start();//Thread 4

        System.out.println("Thread name :" + ab1.getName());
        ab1.setName("Thread 1");
        System.out.println("Thread name :" + ab1.getName());
        System.out.println("Thread priority :" + ab1.getPriority());
        ab1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority :" + ab1.getPriority());
        /*Set<Thread> threadSet
                = Thread.getAllStackTraces().keySet();
        for (Thread x : threadSet) {
            System.out.println(x.getName());
        }*/
    }
}
class ABCD1 extends Thread
{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Am from the class ABCD1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class ABCD2 extends ABCD3 implements Runnable  {
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

class ABCD3{
    public void run1() {}
}


/*  ABCD1 ab1 = new ABCD1();
     //  Runnable ab2 = new ABCD2();
        ABCD2 ab22 = new ABCD2();
      ab1.start();//Thread 2
      // ab1.run();
       ab22.run();
       ab22.show();
      Thread t1 = new Thread(ab22);
      t1.start();//Thread 3

    }
}





    public void show(){
        System.out.println("From show method of ABCD2!!");
    }
}

*/