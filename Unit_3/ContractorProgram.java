import java.text.DecimalFormat;

class ContractorProgram {
    public static void main(String[] args) {
        Contractor contractor = new Contractor("Temporary", "Employee", 2, "Developer", 60.00);
        System.out.println("First Name: " + contractor.getFirstName());
        System.out.println("Last Name: " + contractor.getLastName());
        System.out.println("Contractor ID: " + contractor.getConstractorId());
        System.out.println("Job Title: " + contractor.getJobTitle());
        DecimalFormat wageFormat = new DecimalFormat("$0.00");
        System.out.println("Hourly Wage: " + wageFormat.format(contractor.getHourlyWage()));
        System.out.println("Setting hourly wage to $50.00...");
        contractor.setHourlyWage(50.00);
        System.out.println("Hourly Wage: " + wageFormat.format(contractor.getHourlyWage()));
    }
}