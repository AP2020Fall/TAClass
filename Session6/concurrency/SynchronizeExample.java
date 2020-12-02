package concurrency;

public class SynchronizeExample {
    public static void main(String[] args) throws InterruptedException {
        Database database = new Database();
        for (int i = 0; i < 10000; i++) {
            new IncreaseThread(database).start();
        }
        Thread.sleep(2000);
        System.out.println(Thread.activeCount());
        System.out.println(database.number);
    }
}


class IncreaseThread extends Thread {
    Database database;

    public IncreaseThread(Database database) {
        this.database = database;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //some code
        database.increaseNumber();
    }
}

class Database {
    int number = 0;

    public synchronized void increaseNumber() {
        number++;
    }
}