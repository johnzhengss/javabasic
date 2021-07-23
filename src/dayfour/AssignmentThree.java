package dayfour;

public class AssignmentThree {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Thread(new Producer(buffer),"producer One").start();
        new Thread(new Producer(buffer), "producer two").start();
        new Thread(new Consumer(buffer),"consumer one").start();
    }

}

class Buffer{
    private int[] data = new int[10];
    private int count = 0;

    public synchronized void putItem(int id){
        while (count == data.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        data[count] = id;
        count++;
        this.notify();
    }

    public synchronized int getItem(){
        while (count == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        int id = data[count];
        notifyAll();
        return id;
    }

}

class Producer implements Runnable{

    private Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+ " : " + (i+1));
            buffer.putItem(i+1);
        }
    }
}

class Consumer implements Runnable{

    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {

        for (int i = 0; i < 200; i++){
            System.out.println(Thread.currentThread().getName() + ": "+i+"--id: " + buffer.getItem());
        }
    }
}



