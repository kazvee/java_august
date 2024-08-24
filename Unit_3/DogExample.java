public class DogExample {
  public static void main(String[] args) {
    // Call constructor using keyword new.
    // Assign new Dog object to variable myDog.
    // Class names starts with capital letter
    // but variable name starts with lowercase
    Dog myDog = new Dog("Fluffy", "Beagle", 2, "Brown");
    // Call "get" methods to access data.
    // All methods called via the Dog object created above
    System.out.println("Name: " + myDog.getName());
    System.out.println("Breed: " + myDog.getBreed());
    System.out.println("Age: " + myDog.getAge());
    System.out.println("Color: " + myDog.getColor());
    System.out.print(myDog.getName() + " says ");
    // Call bark() method
    myDog.bark();
  }
}
