package concurrency;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("this is a MyThread instance with id" + this.getId());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("///////this is a MyThread instance with id" + this.getId());
    }
}

public class SleepAndJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        thread3.start();
    }
}
