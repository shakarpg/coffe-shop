package payment;

public class Cred
itCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento com cartão de crédito: R$ " + String.format("%.2f", amount));
    }
}