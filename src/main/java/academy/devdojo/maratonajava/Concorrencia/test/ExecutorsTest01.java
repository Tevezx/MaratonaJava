package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer implements Runnable {
    private Integer num;

    public Printer(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio: %d \n", Thread.currentThread().getName(), num);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Finalizou \n", Thread.currentThread().getName());
    }
}

public class ExecutorsTest01 {
    public static void main(String[] args) {
        // Desaclopa a execucao

        // Cria um pool de threads fixos (quero comecar com 4 threads)
        // ExecutorService executorService = Executors.newFixedThreadPool(4);
 
        // Executa apenas uma thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Nao preciso dar start, ele inicaliza com o .execute
        executorService.execute(new Printer(1));
        executorService.execute(new Printer(2));
        executorService.execute(new Printer(3));
        executorService.execute(new Printer(4));

        // No momento em que executar, ele para o codigo
        executorService.shutdown();
    }
}
