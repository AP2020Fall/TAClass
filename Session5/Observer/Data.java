package Observer;

import java.util.ArrayList;

public class Data {
    private ArrayList<Observer> list = new ArrayList<Observer>();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }

    public void attach(Observer observer) {
        list.add(observer);
    }
}
