class CompositionExample {
    public static void main(String[] args) {
        // Construct CoffeeComposition & TeaComposition objects that have a Beverage
        // objet embedded in them.
        // There's nothing unusual about the constructor calls.
        CoffeeComposition darkRoastCoffee = new CoffeeComposition("dark roast", 375, false, 4.59);
        TeaComposition blackTea = new TeaComposition("black", 350, false, 3.19);
        // Print out information about the drinks using their toString() methods
        System.out.println(darkRoastCoffee);
        System.out.println(blackTea);
    }
}