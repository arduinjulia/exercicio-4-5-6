package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção de notificação que deseja: ");
        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a mensagem que deseja enviar: ");
        String message = scanner.nextLine();

        Notification notification;
        switch (opcao) {
            case 1:
                notification = NotificationFactory.createNotification("email");
                break;
            case 2:
                notification = NotificationFactory.createNotification("sms");
                break;
            case 3:
                notification = NotificationFactory.createNotification("push");
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        notification.send(message);
    }
}