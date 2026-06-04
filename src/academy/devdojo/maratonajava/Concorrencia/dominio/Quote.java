package academy.devdojo.maratonajava.Concorrencia.dominio;

import java.util.StringJoiner;

// storeName: price: discountCode:
public class Quote {
    private final String storeName;
    private final Double price;
    private final Discount.Code discount;

    private Quote(String storeName, Double price, Discount.Code discount) {
        this.storeName = storeName;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Quote.class.getSimpleName() + "[", "]")
                .add("storeName='" + storeName + "'")
                .add("price=" + price)
                .add("discount=" + discount)
                .toString();
    }

    public static Quote newQuote(String value) {
        // Transformando o valor cheio em string
        String[] split = value.split(":");

//        split[0] = storeName, split[1] = price, split[2] = discountCode
        return new Quote(split[0], Double.parseDouble(split[1]), Discount.Code.valueOf(split[2]));
    }

    public String getStoreName() {
        return storeName;
    }

    public Double getPrice() {
        return price;
    }

    public Discount.Code getDiscount() {
        return discount;
    }
}
