package Generics;

import javafx.util.Pair;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Pair<String,Integer> pair=new Pair<>("mohammad",2);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
        Triple<String,Integer,Integer> tripleOne=new Triple<>("triple one",10,20);
        Triple<String,Integer,Integer> tripleTwo=new Triple<>("triple two",40,90);
        Triple<String,Integer,Integer> tripleThree=new Triple<>("triple one",10,20);
//        System.out.println( tripleOne.getFirst());
        System.out.println(tripleOne.equals(tripleThree));
    }
}
