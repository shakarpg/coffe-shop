package decorators;

import coffee.Coffee;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Leite";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.00;
    }
}