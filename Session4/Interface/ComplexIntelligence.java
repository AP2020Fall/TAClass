package Interface;

public interface ComplexIntelligence extends BasinIntelligence{
    void see();
    void think();
    void remember(String key);
    void speak();

    @Override
    default void makeNoise() {
        speak();
    }
}
