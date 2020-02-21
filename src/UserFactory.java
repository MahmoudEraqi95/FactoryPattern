


public class UserFactory {

    public Currency UserFactory(String nationality) {

        switch(nationality){
            case "Egypt":return new EgyptianUser();
            case "Europe":return new EuropeanUser();
            default:return new OtherCountryUser();
        }
    }
}
