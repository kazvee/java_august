public class MemberInheritance {
    public static void main(String[] args) {
        Member testMember = new Member("Janelle", "Java");
        System.out.println("First Name: " + testMember.getFirstName());
        System.out.println("Last Name: " + testMember.getLastName());
        System.out.println("Exp. Date: " + testMember.getExpiryDate());

        Admin testAdmin = new Admin("root", "admin");
        System.out.println("First Name: " + testAdmin.getFirstName());
        System.out.println("Last Name: " + testAdmin.getLastName());
        System.out.println("Exp. Date: " + testAdmin.getExpiryDate());

        User testUser = new User("Amy", "Smith");
        System.out.println("First Name: " + testUser.getFirstName());
        System.out.println("Last Name: " + testUser.getLastName());
        System.out.println("Exp. Date: " + testUser.getExpiryDate());
    }
}