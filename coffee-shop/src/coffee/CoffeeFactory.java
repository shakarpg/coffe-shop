public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "simple":
                return new SimpleCoffee();
            // Add more coffee types here as needed
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}