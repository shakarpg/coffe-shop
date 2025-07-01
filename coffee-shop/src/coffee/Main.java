package coffee;

import decorators.Milk;
import decorators.Sugar;
import payment.CreditCardPayment;
import payment.PixPayment;
import payment.CashPayment;
import payment.PaymentStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.print("Choose your coffee (espresso, latte): ");
        String coffeeType = scanner.nextLine().toLowerCase();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        System.out.print("Would you like to add milk? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new Milk(coffee);
        }

        System.out.print("Would you like to add sugar? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new Sugar(coffee);
        }

        System.out.println("Your order: " + coffee.getDescription());
        System.out.printf("Total cost: $%.2f\n", coffee.getCost());

        System.out.print("Choose payment method (credit/pix/cash): ");
        String paymentMethod = scanner.nextLine().toLowerCase();

        PaymentStrategy payment;
        switch (paymentMethod) {
            case "pix" -> payment = new PixPayment();
            case "cash" -> payment = new CashPayment();
            default -> payment = new CreditCardPayment();
        }
        payment.pay(coffee.getCost());

        System.out.println("Thank you for your order!");

        scanner.close();
    }
}