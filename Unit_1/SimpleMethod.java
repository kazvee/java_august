class SimpleMethod {
  /*
   * This method takes a String parameter with the name of the
   * person to be greeted. It concatenates "Hello, " and the
   * name as a single String and returns that String
   */
  static String sayHello(String name) {
    return "Hello, " + name;
  }

  public static void main(String[] args) {
    String person = "Tina";
    /*
     * Call the sayHello() method passing in String with name as the
     * argument. The returned String is assigned to the String
     * variable greeting
     */
    String greeting = sayHello(person);
    // Print out the greeting
    System.out.println(greeting);
  }
}
