


public class EgyptianUser implements ICurrency {
    @Override
    public double getPrice(double price) {
        return price*16;
    }

    @Override
    public String getCurrencySign() {


        return "L.E";
    }

    @Override
    public String getCurrencyAcronym() {

        return "EGP";

    }
}
