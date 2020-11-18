package Singleton;

public class SingletonExample {
    private static SingletonExample singletonExample = null;

    public static SingletonExample getInstance() {
        if (singletonExample == null)
            singletonExample = new SingletonExample();
        return singletonExample;
    }

    private SingletonExample() {
    }

}
