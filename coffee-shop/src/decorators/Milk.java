package decorators;

import coffee.Coffee;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) { super(coffee); }
    public String getDescription() { return coffee.getDescription() + " + Leite"; }
    public double getCost() { return coffee.getCost() + 1.00; }
}