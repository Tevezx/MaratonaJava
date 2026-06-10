package academy.devdojo.maratonajava.DesignPatterns.test;

import academy.devdojo.maratonajava.DesignPatterns.dominio.*;
import academy.devdojo.maratonajava.DesignPatterns.enums.Country;

public class DateTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("Avião-123");
        Country country = Country.BRASIL;
        ICurrency currency = CurrencyFactory.newCurrency(country);
        Pessoa pessoa = Pessoa
                .PessoaBuilder
                .builder()
                .firstName("Carlos")
                .build();

        ReportDto build = ReportDto
                .ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName (pessoa.getFirstName())
                .build();
        System.out.println(build);
    }
}
