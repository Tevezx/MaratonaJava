package academy.devdojo.maratonajava.Concorrencia.test;

import academy.devdojo.maratonajava.Concorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService service = new StoreService();
//        searchPriceSync(service);
//        searchPriceSyncFuture(service);
        searchPriceSyncCompletableFuture(service);
    }

    private static void searchPriceSync(StoreService service) {
        long start = System.currentTimeMillis();
        System.out.println(service.getPriceSync("Store 1"));
        System.out.println(service.getPriceSync("Store 2"));
        System.out.println(service.getPriceSync("Store 3"));
        System.out.println(service.getPriceSync("Store 4"));
        System.out.println(service.getPriceSync("Store 5"));
        long end = System.currentTimeMillis();

        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));
    }

    private static void searchPriceSyncFuture(StoreService service) {
        long start = System.currentTimeMillis();

        Future<Double> pricesAsyncFuture1 = service.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture2 = service.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture3 = service.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture4 = service.getPricesAsyncFuture("Store 4");

        try {
            pricesAsyncFuture1.get();
            pricesAsyncFuture2.get();
            pricesAsyncFuture3.get();
            pricesAsyncFuture4.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            StoreService.shutdown();
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));

    }

    private static void searchPriceSyncCompletableFuture(StoreService service) {
        long start = System.currentTimeMillis();

        CompletableFuture<Double> pricesAsyncCompletableFuture1 = service.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsyncCompletableFuture2 = service.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsyncCompletableFuture3 = service.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsyncCompletableFuture4 = service.getPricesAsyncCompletableFuture("Store 4");

        System.out.println(pricesAsyncCompletableFuture1.join());
        System.out.println(pricesAsyncCompletableFuture2.join());
        System.out.println(pricesAsyncCompletableFuture3.join());
        System.out.println(pricesAsyncCompletableFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));

    }
}
