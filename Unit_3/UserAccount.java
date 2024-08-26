import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserAccount {
    private String userName;
    private String password;
    private LocalDate dateJoined;
    private boolean activeUser;

    public UserAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.dateJoined = LocalDate.now();
        this.activeUser = true;
    }

    // Allow read-only access to user name
    public String getUserName() {
        return userName;
    }

    // Allow read-only access to date joined
    public LocalDate getDateJoined() {
        return dateJoined;
    }

    // Allow activeUser to be read & set (can change)
    public boolean isActiveUser() {
        return activeUser;
    }

    public void setActiveUser(boolean activeUser) {
        this.activeUser = activeUser;
    }

    public String toString() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        String state = "UserName: " + userName + "\n";
        state += "password: " + password + "\n";
        state += "dateJoined: " + dateFormat.format(dateJoined) + "\n";
        state += "activeUser: " + activeUser + "\n";
        return state;
    }
}
