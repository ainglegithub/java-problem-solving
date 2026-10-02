package practice.oops;


// Abstract Contract
interface PaymentGateway {
    void processPayment(double amount); // Abstract method
}

class CreditCardPayment implements PaymentGateway {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Complex verification & API calling logic hidden here
        System.out.println("Processing credit card payment of $" + amount + " for card " + cardNumber);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // User interacts with the abstract interface, not the complex internals
        PaymentGateway gateway = new CreditCardPayment("4111-XXXX-XXXX-1111");
        gateway.processPayment(250.75);
    }
}
