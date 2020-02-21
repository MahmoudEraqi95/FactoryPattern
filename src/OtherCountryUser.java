public class OtherCountryUser implements Currency {
    @Override
    public double getPrice(double price) {
        return price;
    }

    @Override
    public String getCurrencySign() {

        return "$";

    }

    @Override
    public String getCurrencyAcronym() {

        return "USD";

    }
}
