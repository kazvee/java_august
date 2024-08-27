public class MemberInheritance {
    public static void main(String[] args) {
        Member testMember = new Member("Janelle", "Java");
        System.out.println("First Name: " + testMember.getFirstName());
        System.out.println("Last Name: " + testMember.getLastName());
        System.out.println("Exp. Date: " + testMember.getExpiryDate());
        System.out.println(testMember.getStatus());
        System.out.println("--------------------");

        Admin testAdmin = new Admin("root", "admin", "ABRACADABRA");
        System.out.println("First Name: " + testAdmin.getFirstName());
        System.out.println("Last Name: " + testAdmin.getLastName());
        System.out.println("Exp. Date: " + testAdmin.getExpiryDate());
        System.out.println(testAdmin.getStatus());
        System.out.println("--------------------");

        User testUser = new User("Amy", "Smith");
        System.out.println("First Name: " + testUser.getFirstName());
        System.out.println("Last Name: " + testUser.getLastName());
        System.out.println("Exp. Date: " + testUser.getExpiryDate());
        System.out.println(testUser.getStatus());
    }
}