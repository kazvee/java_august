public class EmployeeProgram {
    public static void main(String[] args) {
        Employee empl = new Employee("Maria", "Smith", 1000, "Manager", 95000);
        System.out.println("First Name: " + empl.getFirstName());
        System.out.println("Last Name: " + empl.getLastName());
        System.out.println("EmplId: " + empl.getEmplId());
        System.out.println("Job Title: " + empl.getJobTitle());
        System.out.println("Salary: " + empl.getSalaryAsString());
        // Now display vacation information
        System.out.println("Vacation Days: " + empl.getVacationDaysRemaining());
        System.out.println("Taking 10 days of vacation...");
        empl.takeVacationDays(10);
        System.out.println("Vacation Days: " + empl.getVacationDaysRemaining());
        System.out.println("Taking 10 more days of vacation...");
        empl.takeVacationDays(10);
        System.out.println("Taking -1 days of vacation...");
        empl.takeVacationDays(-1);
        System.out.println("Increasing vacation days remaining by 14...");
        empl.increaseVacationDaysRemaining(14);
        System.out.println("Vacation Days: " + empl.getVacationDaysRemaining());
    }
}
