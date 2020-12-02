package concurrency;

public class ThreadWithClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("this is a ThreadWithClass example. Line " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new ThreadWithClass();
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("this is main thread. Line " + i);
        }
    }
}
