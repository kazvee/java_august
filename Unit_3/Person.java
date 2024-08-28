import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private LocalDate hireDate;

    // Parameterized constructor
    public Person(String firstName, String lastName, int emplId, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.hireDate = LocalDate.now();
    }

    // Returns the hire date
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Returns the first name
    public String getFirstName() {
        return firstName;
    }

    // Sets the value of attribute firstName to value passed as parameter firstName
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.length() > 0) {
            this.jobTitle = jobTitle;
        }
    }
}
