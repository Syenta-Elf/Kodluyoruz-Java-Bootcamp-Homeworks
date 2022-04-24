
//Kod tekrarını azaltmak için yazdığım meyve şablonu

public abstract class Fruit {
    private String name;
    private int weight;
    private double price;
 
    protected Fruit(String _name, int _Weight,double price){
        name = _name;
        weight = _Weight;
        this.price = price;
    }

    // Meyve satış işlemini filtreledim, eğer kullanıcı stoktakinden fazla meyve almaya çalışırsa uyarı mesajı verir. @selling
    public boolean setWeight(int _weight) {
        if(_weight>this.weight){
            System.out.println("Alabileceğiniz "+this.name+" miktarını aştınız. Alabileceğiniz maksimum miktar: "+weight+" KG.");
            return false;
        }else{
            weight-=_weight;
            System.out.println(_weight+" "+this.name+" aldınız. Depoda kalan miktar: "+weight+" KG");
            return true;
        }
    }


    // Meyve stoğu bilgisini kullıcıya yazdırıyor.
    public void storage()
    {
        System.out.println("Depodaki "+this.name+" miktarı " + weight + " KG");
    }

    // Meyve satış işleminin gerçekleşip gerçekleşmeyeceğini burada görüyoruz. @setWeight
    public void selling(int _weight){
        
        if(setWeight(_weight)){
            System.out.println("Alışveriş tutarınız: " + (_weight * this.getPrice()));
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
