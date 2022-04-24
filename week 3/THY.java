public class THY extends Company {
    //Singleton
    private static THY thy;
    
    private THY() {
        super("THY", new Plane(50, 10),100,new Plane(100,50));  
    }
    public static THY createTHY(){
        if(thy == null){
            thy = new THY();
        }
        return thy;
    }
    
}
