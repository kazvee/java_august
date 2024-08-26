class MemberProgram {
    public static void main(String[] args) {
        Member testMember = new Member("Janelle", "Java");
        System.out.println("First Name: " + testMember.getFirstName());
        System.out.println("Last Name: " + testMember.getLastName());
        System.out.println("Exp. Date: " + testMember.getExpiryDate());
    }
}