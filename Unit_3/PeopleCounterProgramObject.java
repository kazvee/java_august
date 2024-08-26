class PeopleCounterProgramObject {
    public static void main(String[] args) {
        System.out.println("Getting PeopleCounter...");
        PeopleCounter counter = getPeopleCounter();
        System.out.println("Using new PeopleCounter...");
        counter.anotherOne();
    }

    public static PeopleCounter getPeopleCounter() {
        System.out.println("Returning new PeopleCounter...");
        return new PeopleCounter();
    }
}
