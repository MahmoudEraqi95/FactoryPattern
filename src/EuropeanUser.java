


public class EuropeanUser implements Currency {
    @Override
    public double getPrice(double price) {
        //you should use some API to convert the price from USD to the desired currency(in this case EURO)
        return price * .8;
    }

    @Override
    public String getCurrencySign() {

        return "E";

    }

    @Override
    public String getCurrencyAcronym() {

        return "EUR";
    }
}
