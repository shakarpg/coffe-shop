package payment;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento com cartão de crédito: R$ " + String.format("%.2f", amount));
    }
}