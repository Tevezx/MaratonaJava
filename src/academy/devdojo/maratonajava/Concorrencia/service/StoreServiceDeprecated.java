package academy.devdojo.maratonajava.Concorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s\n",storeName);
        return priceGenerator();
    }

    private double priceGenerator(){
        System.out.printf("%s generating price \n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
