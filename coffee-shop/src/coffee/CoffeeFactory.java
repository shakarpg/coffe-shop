package coffee;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "latte" -> new Latte();
            default -> throw new IllegalArgumentException("Tipo de café desconhecido: " + type);
        };
    }
}