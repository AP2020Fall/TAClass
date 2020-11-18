package DecoratorExample;

public class Main {
    public static void printInfo(Coffee c){
        System.out.println("cost: "+c.getPrice()+" ingredients:"+c.getIngredients());
    }
    public static void main(String[] args) {
        Coffee c=new SimpleCoffee();
        printInfo(c);
        /////////////////////////////////////
        Coffee withMilk=new WithMilk(c);
        printInfo(withMilk);
        /////////////////////////////////////
        Coffee WithSprinkles=new WithSprinkles(c);
        printInfo(WithSprinkles);
        ////////////////////////////////////
        Coffee WithSprinklesAndMilk=new WithSprinkles(withMilk);
        printInfo(WithSprinklesAndMilk);
    }
}
