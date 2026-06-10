package academy.devdojo.maratonajava.DesignPatterns.dominio;

import academy.devdojo.maratonajava.DesignPatterns.enums.Country;

import java.util.Currency;

public class CurrencyFactory {
    public static ICurrency newCurrency(Country country){
        switch (country){
            case BRASIL -> {
                return new Real();
            }
            case USA -> {
                return new UsDoll();
            }
            default -> throw new IllegalArgumentException("No currency found for this country");
        }
    }
}

// A pessoa precisa seguir uma regra de negocio
// Ela chama o currencyfactory e passa no metodo um pais que ela queira
// O retorno sera o tipo de moeda desse pais que se encontra na nossa interface
// ela pode pegar o simbolo dessa moeda com getSymbol();
