class AdminUserTest {
    public static void main(String[] args) {
        Admin testAdmin = new Admin("root", "admin", "ABRACADABRA");
        System.out.println("First Name: " + testAdmin.getFirstName());
        System.out.println("Last Name: " + testAdmin.getLastName());
        System.out.println("Secret code: " + testAdmin.getSecret());
        System.out.println("Expiry Date: " + testAdmin.getExpiryDate());
        System.out.println("--------------------");
        User testUser = new User("Amelie", "Smith");
        System.out.println("First Name: " + testUser.getFirstName());
        System.out.println("Last Name: " + testUser.getLastName());
        System.out.println("Expiry Date: " + testUser.getExpiryDate());
    }
}