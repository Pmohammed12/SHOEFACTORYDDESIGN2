public class Test{

    public static void main(String []args){
        // Getting red and blue color shoes from sports shoes factory
        AbstractFactory ShoeFactory = ShoesFactory.getFactory("SPORTS");
        Shoes redsports = ShoeFactory.getShoes("RED");
        redsports.details();
        Shoes bluesports = ShoeFactory.getShoes("BLUE");
        bluesports.details();
        
        //Getting the same color shoes but from dress shoes factory
        ShoeFactory = ShoesFactory.getFactory("DRESS");
        Shoes reddress = ShoeFactory.getShoes("RED");
        reddress.details();
        Shoes bluedress = ShoeFactory.getShoes("BLUE");
        bluedress.details();
    }
}