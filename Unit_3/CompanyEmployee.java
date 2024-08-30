public class CompanyEmployee {
    private String lastName;
    private String firstName;
    int id;
    int salary;

    public CompanyEmployee(String lastName, String firstName, int id, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    // toString() method provides format for printing company employee data:
    // Smith, John ID: 10123 ($85000)
    public String toString() {
        return lastName + ", " + firstName + " ID: " + id + " ($" + salary + ")";
    }
}