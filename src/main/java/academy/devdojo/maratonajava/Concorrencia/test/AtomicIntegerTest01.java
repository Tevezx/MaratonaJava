package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count;
    // Faz a contagem de forma atomica
    private final AtomicInteger atomicInteger = new AtomicInteger();

    // Conseguimos ter controle sobre o lock da thread
    // Se o fair tiver true, ele passa a vez para a thread que esta esperando mais tempo
    private Lock lock = new ReentrantLock(true);

    void increment() {
        lock.lock(); // pego o lock

        try{
            count++;
            // O valor pode ser alterado e retornar algo que nao esperamos
            // count++;
            // Tenho certeza que esses valores nao serao alterados
            atomicInteger.incrementAndGet(); // incrementa e pega
        }finally {
            lock.unlock(); // liberando o lock
        }
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getAtomicInteger());

    }
}
