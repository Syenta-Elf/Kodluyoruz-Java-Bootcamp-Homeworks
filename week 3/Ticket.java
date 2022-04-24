public class Ticket {
    private int totalFare;
    private Company company;

    public Ticket(Company company) {
        setCompany(company);
        this.totalFare = 0;
    }

    public Company getCompany() {
        return company;
    }

    private void setCompany(Company company) {
        this.company = company;
    }
    public int getTotalFare() {
        return totalFare;
    }
    public void buyTicket(int passengerCount, boolean isAboard, boolean isBussiness){
        
        //yurtdışı uçuş
        if (isAboard) {
            if (company.getAboardPlane() != null ) {
                this.totalFare += 200;
                if (isBussiness) {
                    if(!company.getAboardPlane().isBussinessFull(passengerCount)){
                        this.totalFare += 50;
                    }
                } else if(!company.getAboardPlane().isEconomyFull(passengerCount)) {
                    calculateFare(passengerCount);
                }else{
                    System.out.println("Boş koltuk yok.");
                }
            } else {
                System.out.println(company.getCompanyName() + "'in yurt dışı uçuşu bulunmamakta.");
            }
        }else{
            if (isBussiness) {
                if(!company.getPlane().isBussinessFull(passengerCount))
                    {
                        this.totalFare += 40;
                        calculateFare(passengerCount);
                    }else{
                        System.out.println("Boş koltuk yok.");
                    }
            } else if(!company.getPlane().isEconomyFull(passengerCount)) {
                calculateFare(passengerCount);
            }else{
                System.out.println("Boş koltuk yok.");
            }

        }
    }
    private int calculateFare(int passengerCount) {
        totalFare += company.getFare();
        return totalFare = totalFare * passengerCount;
    }
}
