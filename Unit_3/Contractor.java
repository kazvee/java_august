public class Contractor extends Person {
    int contractorId;
    double hourlyWage;
    double totalWage;

    public Contractor(String firstName, String lastName, int contractorId, String jobTitle, double hourlyWage) {
        super(firstName, lastName, contractorId, jobTitle);
        this.contractorId = contractorId;
        this.hourlyWage = hourlyWage;
    }

    public int getConstractorId() {
        return contractorId;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage > 0) {
            this.hourlyWage = hourlyWage;
        }
    }
}
