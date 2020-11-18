package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample s1=SingletonExample.getInstance();
        SingletonExample s2=SingletonExample.getInstance();
        System.out.println(s1==s2);
    }
}
