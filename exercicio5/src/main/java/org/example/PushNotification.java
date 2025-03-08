package org.example;

public class PushNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("O Push foi enviado: " + message);
    }
}
