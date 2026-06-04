package academy.devdojo.maratonajava.Concorrencia.dominio;

// storeName: price: discountCode:
public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(10), SUPER_SAYAJIN3(15);
        private final Integer percentage;

        Code(Integer percentage) {
            this.percentage = percentage;
        }

        public Integer getPercentage() {
            return percentage;
        }
    }
}
