public class Pear extends Fruit {

    private static Fruit pear = new Pear("Armut",15,20);
    private Pear(String _name, int _Weight,double price) {
        super(_name,_Weight,price);
    }

    public static Fruit createPear(){
        return pear;
    }
    
}
