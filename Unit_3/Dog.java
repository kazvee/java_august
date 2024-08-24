// Note that the class is explicitly marked public
public class Dog {
  // Private attributes
  private String name;
  private String breed;
  private int age;
  private String color;

  // Public constructor with parameters
  public Dog(String name, String breed, int age, String color) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.color = color;
  }

  // Accessor methods to provide read access to data in attributes
  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  // Methods for behaviors
  public void bark() {
    System.out.println("Woof!");
  }

  public void fetch() {
    System.out.println(name + " went to fetch.");
  }
}
