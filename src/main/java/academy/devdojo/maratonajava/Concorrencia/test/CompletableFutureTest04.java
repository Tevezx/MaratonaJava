package academy.devdojo.maratonajava.Concorrencia.test;

import academy.devdojo.maratonajava.Concorrencia.dominio.Quote;
import academy.devdojo.maratonajava.Concorrencia.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("store1", "store2", "store3", "store4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream()
                .map(service::getPriceSync) // pego o preco
                .map(Quote::newQuote)// gero o quote
                .map(service::applyDiscount) // aplico o desconto
                .forEach(System.out::println);

    }
}
