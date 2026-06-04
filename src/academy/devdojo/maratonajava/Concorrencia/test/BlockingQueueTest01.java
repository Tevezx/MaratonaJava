package academy.devdojo.maratonajava.Concorrencia.test;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // tem que ter o limite
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Carlos");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");

        new Thread(new RemoveFromQueue(bq)).start();
        // Bloqueia a thread, pois a capacidade dela é de 1
        bq.put("Ana");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    // removo o valor para que o proximo possa ser inserido
    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                // bq.take() remove o primeiro elemento da lista
                System.out.printf("%s removing value fro queue %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
