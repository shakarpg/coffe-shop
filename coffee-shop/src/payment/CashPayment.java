package payment;

public class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagamento em dinheiro: R$ " + String.format("%.2f", amount));
    }
}