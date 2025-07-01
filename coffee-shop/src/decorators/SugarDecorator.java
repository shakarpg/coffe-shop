public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", com açúcar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.10; // Adiciona o custo do açúcar
    }
}