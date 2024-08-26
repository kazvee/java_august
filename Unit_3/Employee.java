import java.text.DecimalFormat;
import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private int emplId;
    private String jobTitle;
    private double salary;
    private LocalDate hireDate;

    // Parameterized constructor
    public Employee(String firstName, String lastName, int emplId, String jobTitle,
            double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emplId = emplId;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = LocalDate.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        }
    }

    // EmplId cannot be changed, so there is only accessor, no mutator method
    public int getEmplId() {
        return emplId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.length() > 0) {
            this.jobTitle = jobTitle;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.00) {
            this.salary = salary;
        }
    }

    public String getSalaryAsString() {
        // Format salary with leading dollar sign and 2 decimal places
        DecimalFormat salaryFormat = new DecimalFormat("$0.00");
        // Use getSalary to get numeric value and then format
        return salaryFormat.format(getSalary());
    }

    // Method to increase salary by percent as decimal. 0.02 is a 2% raise
    public void increaseSalary(double percentAsDecimal) {
        if (percentAsDecimal > 0.0) {
            this.salary *= (1 + percentAsDecimal);
        } else {
            System.out.println("Salary increase must be greater than 0.");
        }
    }
}
