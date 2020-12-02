package concurrency;

public class ThreadWithInterface implements Runnable {
    @Override
    public void run() {
        System.out.println("i am a ThreadWithInterface example");
    }

    public static void main(String[] args) {
//        Thread thread=new Thread(new ThreadWithInterface());
//        thread.start();
//
//        Thread lambdaThread = new Thread(() -> {
//            System.out.println("i am a ThreadWithLambda example");
//        });
//        lambdaThread.start();

        new Thread(() -> System.out.println("i am a ThreadWithLambda example")).start();


    }
}
