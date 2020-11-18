package Generics;

import javafx.util.Pair;

import java.util.Objects;

public class Triple<T1,T2,T3> {
    private T1 first;
    private T2 second;
    private T3 third;

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public T3 getThird() {
        return third;
    }

    public void setThird(T3 third) {
        this.third = third;
    }

    public Triple(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o instanceof Triple) {
            Triple pair = (Triple) o;
            if (!Objects.equals(first,pair.first)) return false;
            if (!Objects.equals(second,pair.second)) return false;
            if (!Objects.equals(third,pair.third)) return false;
            return true;
        }
        return false;
    }
}
