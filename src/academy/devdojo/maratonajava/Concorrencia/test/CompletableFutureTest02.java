package academy.devdojo.maratonajava.Concorrencia.test;

import academy.devdojo.maratonajava.Concorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService service = new StoreService();
        searchPriceSyncCompletableFuture(service);
    }

    private static void searchPriceSyncCompletableFuture(StoreService service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("store1", "store2", "store3", "store4");

//        List<Double> prices = stores.stream()
//                .map(service::getPricesAsyncCompletableFuture)
//                .map(CompletableFuture::join)
//                .toList();

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(service::getPricesAsyncCompletableFuture)
                .toList();

        List<Double> prices = completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(prices);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));

    }
}
