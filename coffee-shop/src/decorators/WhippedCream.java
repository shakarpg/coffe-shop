package decorators;

import coffee.Coffee;

public class WhippedCream extends CoffeeDecorator {
    public WhippedCream(Coffee coffee) { super(coffee); }
    public String getDescription() { return coffee.getDescription() + " + Chantilly"; }
    public double getCost() { return coffee.getCost() + 2.00; }
}