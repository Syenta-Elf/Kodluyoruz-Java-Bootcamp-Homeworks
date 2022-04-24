public class Plane {

    private static int economyCapacity;
    private static int bussinessCapacity;
    private static int economyPassengerTotal;
    private static int bussinessPassengerTotal;

    public Plane(int economyC, int bussinessC) {
        economyCapacity = economyC;
        bussinessCapacity = bussinessC;
        bussinessPassengerTotal = 0;
        economyPassengerTotal = 0;
    }

    public boolean isEconomyFull(int passengerCount) {
        if (economyCapacity >= economyPassengerTotal && economyCapacity >= economyPassengerTotal+passengerCount) {
            economyPassengerTotal += passengerCount;
            return false;
        } else {
            return true;
        }
    }

    public boolean isBussinessFull(int passengerCount) {
        if (bussinessCapacity >= bussinessPassengerTotal && bussinessCapacity >= bussinessPassengerTotal+passengerCount) {
            bussinessPassengerTotal += passengerCount;
            return false;
        } else {
            return true;
        }
    }

    public static int getBussinessPassengerTotal() {
        return bussinessPassengerTotal;
    }

    public static void setBussinessPassengerTotal(int bussinessPassengerTotal) {
        Plane.bussinessPassengerTotal = bussinessPassengerTotal;
    }

    public static int getBussinessCapacity() {
        return bussinessCapacity;
    }

    public static int getEconomyCapacity() {
        return economyCapacity;
    }

    public static int getEconomyPassengerTotal() {
        return economyPassengerTotal;
    }

    public static void setEconomyPassengerTotal(int economyPassengerTotal) {
        Plane.economyPassengerTotal = economyPassengerTotal;
    }

}
