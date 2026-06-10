package academy.devdojo.maratonajava.DesignPatterns.dominio;

import academy.devdojo.maratonajava.DesignPatterns.enums.Country;

import java.util.StringJoiner;

public class ReportDto {
    // Ao invés de ter que passar 4 objetos diferentes
    // Eu apenas agrupo o que eu preciso em uma classe chamada DTO (Date transfer Object)

    private String aircraftName;
    private Country country;
    private ICurrency currency;
    private String personName;

    @Override
    public String toString() {
        return new StringJoiner(", ", ReportDto.class.getSimpleName() + "[", "]")
                .add("aircraftName='" + aircraftName + "'")
                .add("country=" + country)
                .add("currency=" + currency)
                .add("personName='" + personName + "'")
                .toString();
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private ICurrency currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(ICurrency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.personName = this.personName;
            reportDto.country = this.country;
            reportDto.currency = this.currency;
            reportDto.aircraftName = this.aircraftName;
            return reportDto;
        }
    }
}
