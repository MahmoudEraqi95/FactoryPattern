


public class UserFactory {

    public ICurrency UserFactory(Countries nationality) {

        switch(nationality){
            case Egypt:return new EgyptianUser();
            case Europe:return new EuropeanUser();
            default:return new OtherCountryUser();
        }
    }
}
