import java.time.LocalDate;

public class Member {
    private String firstName;
    private String lastName;
    private int expiryDays = 365;
    private LocalDate expiryDate;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        expiryDate = LocalDate.now().plusDays(expiryDays);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getStatus() {
        return firstName + " " + lastName + " is a Member.";
    }
}
