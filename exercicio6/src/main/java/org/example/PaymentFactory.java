package org.example;

public class PaymentFactory {
    public static PaymentStrategy getPaymentMethod(int escolhido) {
        switch (escolhido) {
            case 1:
                return new PixPayment();
            case 2:
                return new CreditCardPayment();
            case 3:
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Opção inválida de pagamento.");
        }
    }
}
