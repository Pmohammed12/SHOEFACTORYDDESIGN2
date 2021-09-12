public class DressShoeFactory implements AbstractFactory {
    public Shoes getShoes(String color){
        if(color.equalsIgnoreCase("RED")){
            return new RedDressShoes();
        }
        else if(color.equalsIgnoreCase("BLUE")){
            return new BlueDressShoes();
        }
        return null;
    }
}
