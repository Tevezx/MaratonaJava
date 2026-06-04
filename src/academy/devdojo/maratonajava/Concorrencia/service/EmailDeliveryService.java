package academy.devdojo.maratonajava.Concorrencia.service;

import academy.devdojo.maratonajava.Concorrencia.dominio.Members;

public class EmailDeliveryService implements Runnable {
    //Vai enviar emails
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " - Starting to Delivery emails");
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email == null) continue;
                System.out.println(threadName + " - Enviando email para: " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " - Enviou email com sucesso para: " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" - Todos os emails enviados com sucesso!");
    }
}
