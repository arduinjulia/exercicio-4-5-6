package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a forma de pagamento: ");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de crédito");
        System.out.println("3 - Boleto");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o valor da transação: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        try {
            // Criando a estratégia de pagamento via Factory Method
            PaymentStrategy strategy = PaymentFactory.getPaymentMethod(escolha);

            // Processando o pagamento utilizando a estratégia escolhida
            PaymentProcessor processor = new PaymentProcessor(strategy);
            processor.process(valor);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}