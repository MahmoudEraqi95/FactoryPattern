import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
            ICurrency ICurrency = new UserFactory().UserFactory(Countries.USA);
            ArrayList<Product> products = new ArrayList<>();
            products.add(new Product("iPhone 8"," Apple iPhone Device",200));
            products.add(new Product("Samsung s 10"," Samsung Device",300));
            products.add(new Product("Oppo f9","  Device",220));

            new PrintProducts(ICurrency,products);
    }

}
