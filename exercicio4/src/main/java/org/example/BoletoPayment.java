package org.example;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String codigoBoleto = "123456789-boleto";
        System.out.println("O boleto para pagamento foi gerado com sucesso. O código dele é: " + codigoBoleto);
    }
}
