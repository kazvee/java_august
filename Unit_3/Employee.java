import java.text.DecimalFormat;

public class Employee extends Person {
    private int emplId;
    private double salary;
    private int vacationDaysPerYear = 14;
    private int vacationDaysRemaining;

    // Parameterized constructor
    public Employee(String firstName, String lastName, int emplId, String jobTitle, double salary) {
        super(firstName, lastName, emplId, jobTitle);
        this.salary = salary;
        this.emplId = emplId;
        vacationDaysRemaining = vacationDaysPerYear;
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

    // EmplId cannot be changed, so there is only accessor, no mutator method
    public int getEmplId() {
        return emplId;
    }

    // Method to increase salary by percent as decimal. 0.02 is a 2% raise
    public void increaseSalary(double percentAsDecimal) {
        if (percentAsDecimal > 0.0) {
            salary *= (1 + percentAsDecimal);
        }
    }

    // Increase vacation days per year
    public void increaseVacationDaysPerYear(int days) {
        if (days > 0) {
            this.vacationDaysPerYear += days;
        }
    }

    // Increase remaining vacation days
    public void increaseVacationDaysRemaining(int days) {
        if (days > 0) {
            this.vacationDaysRemaining += days;
        }
    }

    // Use vacation days
    public void takeVacationDays(int days) {
        if (days > 0 && vacationDaysRemaining >= days) {
            this.vacationDaysRemaining -= days;
        } else if (days <= 0) {
            System.out.println("Requested vacation days must > 0");
        } else {
            System.out.println("Employee does not have sufficient vacation to take " +
                    days + " days off.");
        }
    }

    // Return number vacation days remaining
    public int getVacationDaysRemaining() {
        return vacationDaysRemaining;
    }
}
