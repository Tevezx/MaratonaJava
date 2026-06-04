package academy.devdojo.maratonajava.Concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();

        try {
            String threadName = Thread.currentThread().getName();
            emails.add(email);
            System.out.println(threadName + " - Adicionou email na lista!");
            // Avisando as thread que tem um email, acordando todas elas
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - Checando se há emails");
        lock.lock();
        try {
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " - Não tem emails disponiveis na lista, entrando em modo de espera");
                // Só posso chamar o wait se eu tiver o lock
                condition.await();
            }
        } finally {
            lock.unlock();
        }

        return this.emails.poll();
    }

    public void close() {
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " - Notificando a todos que não estamos mais pegando emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
