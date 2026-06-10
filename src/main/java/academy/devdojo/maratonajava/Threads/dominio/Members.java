package academy.devdojo.maratonajava.Threads.dominio;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        //uma thread por vez acessa o pendingEmails
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            String threadName = Thread.currentThread().getName();
            emails.add(email);
            System.out.println(threadName + " - Adicionou email na lista!");
            // Avisando as thread que tem um email, acordando todas elas
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - Checando se há emails");
        synchronized (emails){
            while(this.emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " - Não tem emails disponiveis na lista, entrando em modo de espera");
                // Só posso chamar o wait se eu tiver o lock
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName() + " - Notificando a todos que não estamos mais pegando emails");
            this.emails.notifyAll();
        }
    }
}
