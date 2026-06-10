package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.CurrencyFactory;
import academy.devdojo.maratonajava.DesignPatterns.dominio.ICurrency;
import academy.devdojo.maratonajava.DesignPatterns.enums.Country;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        ICurrency iCurrency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(iCurrency.getSymbol());
    }
}
