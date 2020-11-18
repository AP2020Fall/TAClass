package interfaceExample;

public interface MakingSound {
    public void makeSound();
}

class Cat implements MakingSound {

    @Override
    public void makeSound() {
        System.out.println("the cats says mew mew");
    }
}
class Bird implements MakingSound{

    @Override
    public void makeSound() {
        System.out.println("the bird says tweet tweet");
    }
}
