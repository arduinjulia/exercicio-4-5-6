package org.example;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String codigoPix = "123456789-pix";
        System.out.println("O pagamento via Pix foi gerado com sucesso. O código Pix é: " + codigoPix);
    }
}
