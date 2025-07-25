package decorators;

import coffee.Coffee;

public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) { super(coffee); }
    public String getDescription() { return coffee.getDescription() + " + Chocolate"; }
    public double getCost() { return coffee.getCost() + 1.50; }
}