package coffee;

import decorators.CoffeeDecorator;
import payment.CreditCardPayment;
import payment.Payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Coffee Shop!");
        System.out.print("Choose your coffee (simple, latte, cappuccino): ");
        String coffeeType = scanner.nextLine();
        
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
        
        System.out.print("Would you like to add milk? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new MilkDecorator(coffee);
        }
        
        System.out.print("Would you like to add sugar? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            coffee = new SugarDecorator(coffee);
        }
        
        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Total cost: $" + coffee.getCost());
        
        System.out.print("Choose payment method (credit): ");
        String paymentMethod = scanner.nextLine();
        
        Payment payment = new CreditCardPayment();
        payment.pay(coffee.getCost());
        
        System.out.println("Thank you for your order!");
        
        scanner.close();
    }
}