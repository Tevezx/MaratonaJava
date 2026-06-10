package academy.devdojo.maratonajava.Concorrencia.service;

import academy.devdojo.maratonajava.Concorrencia.dominio.Discount;
import academy.devdojo.maratonajava.Concorrencia.dominio.Quote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    // price gera um preco com a funcao abaixo
    // discount pega um disconto aleatorio entre 0 e 3 (que sao o tamanho dos descontos que tem na classe discount)
    // return uma string com o storeName, price e discount
    public String getPriceSync(String storeName) {
        Double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    // Aplicando discount
    public String applyDiscount(Quote quote) {
        delay();
        Double discountValue = quote.getPrice() * (100 - quote.getDiscount().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'", quote.getStoreName(), quote.getPrice(), quote.getDiscount(), discountValue);
    }

    private double priceGenerator() {
        delay(); // Busco o preco com um delay de 1 segundo
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10; // Pego um preco aleatorio entre 1 e 500 e multiplico por 100
    }

    // delay acrescentado de 1 segundo
    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
