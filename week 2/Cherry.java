public class Cherry extends Fruit {

    //Birer tane meyve oluşacağından Singleton tasarım kalıbını kullandım.

    private static Fruit cherry = new Cherry("Kiraz",15,40);
   
    private Cherry(String _name, int _Weight,double price) {
        super(_name,_Weight,price);
    }

    public static Fruit createCherry(){
        return cherry;
    }
}
