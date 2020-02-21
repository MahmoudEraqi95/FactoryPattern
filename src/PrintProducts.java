
import java.util.ArrayList;

public class PrintProducts {


    public PrintProducts(Currency currency, ArrayList<Product> products) {

        for (Product product: products) {

            System.out.println("Name: "+product.getName()+" Desc: "+product.getDesc()
                    +" Price: "+currency.getPrice(product.getPrice())+" "+currency.getCurrencySign());

        }

    }
}
