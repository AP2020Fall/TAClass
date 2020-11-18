package interfaceExample;

import java.util.ArrayList;

public class InterfaceTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        ArrayList<MakingSound> list = new ArrayList<>();
        list.add(cat);
        list.add(bird);
        for (MakingSound animal : list) {
            animal.makeSound();
        }
    }
}
