package academy.devdojo.maratonajava.Concorrencia.test;

import academy.devdojo.maratonajava.Concorrencia.service.StoreService;
import academy.devdojo.maratonajava.Concorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPriceSyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPriceSyncCompletableFuture(StoreServiceDeprecated service) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("store1", "store2", "store3", "store4");
        List<CompletableFuture<Double>> completableFuture = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .toList();

        List<Double> collect = completableFuture.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(collect);

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d\n", (end - start));

    }
}
