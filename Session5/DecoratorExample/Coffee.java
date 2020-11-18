package DecoratorExample;

public interface Coffee {
    public double getPrice();

    public String getIngredients();
}
class SimpleCoffee implements Coffee{
    @Override
    public double getPrice() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "coffee";
    }
}