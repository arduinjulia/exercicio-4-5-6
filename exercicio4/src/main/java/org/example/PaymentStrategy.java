package org.example;

public interface PaymentStrategy {
    public default void processPayment(double amount){
    }
}
