package concurrency;

public class MyDatabase {
    public void method1() throws InterruptedException {
        //some code
        synchronized (this) {
            System.out.println("method1 started");
            wait();
            Thread.sleep(4000);
            System.out.println("method1 ended");
        }
        //some code
    }

    public void method2() throws InterruptedException {
        synchronized (this) {
            System.out.println("method2 started");
            Thread.sleep(4000);
            notify();
            System.out.println("method2 ended");
        }
    }

    public void method3() throws InterruptedException {
        System.out.println("method3 started");
        Thread.sleep(3000);
        System.out.println("method3 ended");
    }
//    public void method3() throws InterruptedException {
//        System.out.println("method3 started");
//        Thread.sleep(3000);
//        System.out.println("method4 ended");
//    }

    public static void main(String[] args) {
        MyDatabase myDatabase = new MyDatabase();
        Thread thread1 = new ThreadClass1(myDatabase);
        Thread thread2 = new ThreadClass2(myDatabase);
        Thread thread3 = new ThreadClass3(myDatabase);
//        thread3.start();
        thread1.start();
        thread2.start();
    }
}

class ThreadClass1 extends Thread {
    MyDatabase myDatabase;

    public ThreadClass1(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    @Override
    public void run() {
        try {
            myDatabase.method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadClass2 extends Thread {
    MyDatabase myDatabase;

    public ThreadClass2(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    @Override
    public void run() {
        try {
            myDatabase.method2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadClass3 extends Thread {
    MyDatabase myDatabase;

    public ThreadClass3(MyDatabase myDatabase) {
        this.myDatabase = myDatabase;
    }

    @Override
    public void run() {
        try {
            myDatabase.method3();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}