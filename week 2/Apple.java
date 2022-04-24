public class Apple extends Fruit {
    
    private static Fruit apple = new Apple("Elma",20,15);  
    private Apple(String _name, int _Weight,double price) {
        super(_name,_Weight,price);
    }

    public static Fruit createApple(){
        return apple;
    }
    
}
