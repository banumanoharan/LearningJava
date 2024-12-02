package practice.multithreading;

public class Sample11_ThreadSample
{
    public static void main(String[] args) {
        new Thread(new Task1()).start();
    }
}
class Task1 implements Runnable {

    private String threadNo;

    public Task1(String no){
        this.threadNo = no;
    }

    public Task1() {
        System.out.println("From Task1 Thread!");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start execution. Thread No = "+threadNo);
        processThread();
        System.out.println(Thread.currentThread().getName()+" stop execution.");
    }

    private void processThread() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

       @Override
    public String toString(){
        return this.threadNo;
    }
}
