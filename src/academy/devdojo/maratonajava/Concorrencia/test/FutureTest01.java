package academy.devdojo.maratonajava.Concorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        // Processamento syncrono -> thread executando as coisas do comeco ao fim (bloqueia a tela)
        // Processamento assyncrono -> thread executa uma funcao enquanto tambem executa outra funcao (nao bloqueia a tela)

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dolarRequest = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return 4.35D;
            }
        });

        System.out.println(doSomething());

        // Executa a acao de pegar o dolar em 3 segundos
        Double dolarResponse = null;
        try {
            dolarResponse = dolarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        System.out.println("Dolar: " + dolarResponse);
    }

    private static Long doSomething() {
        System.out.println(Thread.currentThread().getName());

        long sum = 0L;

        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }

        return sum;
    }
}
