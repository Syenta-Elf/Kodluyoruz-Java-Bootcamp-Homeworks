public class Pegasus extends Company {

    //Singleton
    private static Pegasus pegasus;

    //Singleton
    private Pegasus() {
        super("Pegasus", new Plane(40, 5),70,null);
    }

    public static Pegasus createpegasus(){
        if(pegasus == null){
            pegasus = new Pegasus();
        }
        return pegasus;
    }
}
