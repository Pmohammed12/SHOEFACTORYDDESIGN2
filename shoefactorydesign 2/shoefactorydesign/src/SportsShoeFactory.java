public class SportsShoeFactory implements AbstractFactory {
    public Shoes getShoes(String color){
        if(color.equalsIgnoreCase("RED")){
            return new RedSportsShoes();
        }
        else if(color.equalsIgnoreCase("BLUE")){
            return new BlueSportsShoes();
        }
        return null;
    }
}