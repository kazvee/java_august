public class User extends Member {
    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getStatus() {
        return getFirstName() + " " + getLastName() + " is a User.";
    }
}
