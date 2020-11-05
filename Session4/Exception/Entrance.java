package Exception;

import java.time.LocalTime;
import java.util.ArrayList;

public class Entrance {
    LocalTime time;
    Car car;
    boolean hasCheckout;
    int price;
    public static ArrayList<Entrance> allEntrances = new ArrayList<>();

    public Entrance(LocalTime time, Car car) {
        this.time = time;
        this.car = car;
        hasCheckout = false;
        allEntrances.add(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
