public abstract class Company{

    private String companyName;
    private Plane plane;
    private int fare;
    private Plane aboardPlane;
    
    public Company(String companyName, Plane plane,int fare,Plane aboardPlane) {
        this.companyName = companyName;
        this.plane = plane;
        this.fare = fare;
        setAboardPlane(aboardPlane);
    }
    public Plane getAboardPlane() {
        return aboardPlane;
    }
    private void setAboardPlane(Plane aboardPlane) {
        this.aboardPlane = aboardPlane;
    }
    public String getCompanyName() {
        return companyName;
    }  
    public Plane getPlane() {
        return this.plane;
    }
    public int getFare(){
        return fare;
    }
}
