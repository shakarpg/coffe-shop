public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of: $" + amount);
        // Logic for processing credit card payment can be added here
    }
}