package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num; i++) {
            System.out.printf("%s executando uma tarefa callable...\n", Thread.currentThread().getName());
        }

        return String.format("\n%s finalizou o numero aleatorio %d", Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();

        // Criando 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Programa finalizado %s", s);
    }
}
