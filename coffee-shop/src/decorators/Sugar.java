package src.decorators;

import coffee.Coffee;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) { super(coffee); }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Açúcar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.50;
    }
}