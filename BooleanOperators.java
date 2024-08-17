class BooleanOperators {
  public static void main(String[] args) {
    int number = 1;
    // == will return true or false
    System.out.println(number == 1);
    System.out.println(number == 0);
    System.out.println(number != 0);

    System.out.println("Using && (and) Boolean Operator: ");
    int num1 = 1;
    int num2 = 2;
    if (num1 == 0 && num2 == 0) {
      System.out.println("A is false, B is false: true");
    } else {
      System.out.println("A is false, B is false: false");
    }

    if (num1 == 0 && num2 == 2) {
      System.out.println("A is false, B is true: true");
    } else {
      System.out.println("A is false, B is true: false");
    }

    if (num1 == 1 && num2 == 0) {
      System.out.println("A is true, B is false: true");
    } else {
      System.out.println("A is true, B is false: false");
    }

    if (num1 == 1 && num2 == 2) {
      System.out.println("A is true, B is true: true");
    } else {
      System.out.println("A is true, b is true: false");

    }
    System.out.println("Using || (or) Boolean Operator: ");
    int num3 = 1;
    int num4 = 2;

    if (num3 == 0 || num4 == 0) {
      System.out.println("A is false, B is false: true");
    } else {
      System.out.println("A is false, B is false: false");
    }

    if (num3 == 0 || num4 == 2) {
      System.out.println("A is false, B is true: true");
    } else {
      System.out.println("A is false, B is true: false");
    }

    if (num3 == 1 || num4 == 0) {
      System.out.println("A is true, B is false: true");
    } else {
      System.out.println("A is true, B is false: false");
    }

    if (num3 == 1 || num4 == 2) {
      System.out.println("A is true, B is true: true");
    } else {
      System.out.println("A is true, b is true: false");
    }
  }
}