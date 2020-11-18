package DecoratorExample;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice();
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}

class WithMilk extends CoffeeDecorator {

    protected WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " with milk";
    }
}

class WithSprinkles extends CoffeeDecorator {

    protected WithSprinkles(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.3;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " with sprinkles";
    }
}
