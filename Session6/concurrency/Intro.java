package concurrency;

public class Intro {
    public static void main(String[] args) {
        Thread.currentThread().setName("my thread");
        System.out.println("Thread.activeCount() " + Thread.activeCount() +
                "\nThread.currentThread().getName() " + Thread.currentThread().getName() +
                "\nThread.currentThread().getId() " + Thread.currentThread().getId() +
                "\nThread.currentThread().getState() " + Thread.currentThread().getState() +
                "\nThread.currentThread().getPriority() " + Thread.currentThread().getPriority() +
                "\nThread.currentThread().isDaemon() " + Thread.currentThread().isDaemon());
    }
}
