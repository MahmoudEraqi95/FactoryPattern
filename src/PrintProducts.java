
import java.util.ArrayList;

public class PrintProducts {


    public PrintProducts(ICurrency ICurrency, ArrayList<Product> products) {

        for (Product product: products) {

            System.out.println("Name: "+product.getName()+" Desc: "+product.getDesc()
                    +" Price: "+ ICurrency.getPrice(product.getPrice())+" "+ ICurrency.getCurrencySign());

        }

    }
}
