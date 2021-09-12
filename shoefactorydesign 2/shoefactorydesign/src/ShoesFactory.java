public class ShoesFactory {
    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("SPORTS")){
            return new SportsShoeFactory();
        }
        else if(type.equalsIgnoreCase("DRESS")){
            return new DressShoeFactory();
        }
        return null;
    }
}
