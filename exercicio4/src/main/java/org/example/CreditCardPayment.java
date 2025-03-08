package org.example;
import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do cartão de crédito: ");
        String cardNumber = scanner.nextLine();
        System.out.println("O pagamento no valor de R$" + amount + " foi realizado com sucesso via Cartão de Crédito");
    }
}