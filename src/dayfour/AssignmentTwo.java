package dayfour;

public class AssignmentTwo {

    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
    }
}

class LockDemo{
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();
}

class ThreadOne extends Thread{
    @Override
    public void run() {
        synchronized (LockDemo.lock1){

            try {
                Thread.sleep(100);
                System.out.println("lock1 is using, waiting for lock2...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LockDemo.lock2){
                System.out.println("lock1 and lock2 are using...");
            }
        }
    }
}

class ThreadTwo extends Thread{
    @Override
    public void run() {
        synchronized (LockDemo.lock2){

            try {
                Thread.sleep(100);
                System.out.println("lock2 is using, waiting for lock1...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LockDemo.lock1){
                System.out.println("lock1 and lock2 are using...");
            }
        }
    }
}
