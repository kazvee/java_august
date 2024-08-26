import java.text.DecimalFormat; // Needed for DecimalFormat

public class EmployeeProgram {
    public static void main(String[] args) {
        // Create a DecimalFormat object for formatting the salary
        DecimalFormat salaryFormat = new DecimalFormat("#,##0.00");

        // Assuming the Employee class is correctly implemented
        Employee empl = new Employee("Maria", "Smith", 1000, "Manager", 95000);

        System.out.println("First Name: " + empl.getFirstName());
        System.out.println("Last Name: " + empl.getLastName());
        System.out.println("EmplId: " + empl.getEmplId());
        System.out.println("Job Title: " + empl.getJobTitle());
        System.out.println("Salary: " + salaryFormat.format(empl.getSalary()));

        // Increase the salary (ensure that your method does not accept negative
        // percentages unless that's intended)
        empl.increaseSalary(0.02);
        System.out.println("After Raise: " + salaryFormat.format(empl.getSalary()));
    }
}
