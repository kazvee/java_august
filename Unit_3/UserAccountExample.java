public class UserAccountExample {
    public static void main(String[] args) {
        UserAccount account = new UserAccount("TestUser456", "TestTest123");
        if (account.isActiveUser()) {
            System.out.println(account.getUserName() + " is active.");
        } else {
            System.out.println(account.getUserName() + " is not active.");
        }
        // Added for debugging
        System.out.println("\nDebugging info:\n" + account.toString());
    }
}
