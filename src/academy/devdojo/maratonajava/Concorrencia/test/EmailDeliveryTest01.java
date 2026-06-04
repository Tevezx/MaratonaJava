package academy.devdojo.maratonajava.Concorrencia.test;

import academy.devdojo.maratonajava.Concorrencia.dominio.Members;
import academy.devdojo.maratonajava.Concorrencia.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread thread = new Thread(new EmailDeliveryService(members), "Carlos");
        Thread thread1 = new Thread(new EmailDeliveryService(members), "Ana");

        thread.start();
        thread1.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
