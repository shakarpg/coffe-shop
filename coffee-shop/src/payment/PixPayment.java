package payment;

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento via PIX: R$ " + String.format("%.2f", amount));
    }
}