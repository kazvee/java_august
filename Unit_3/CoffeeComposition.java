public class CoffeeComposition {
    // Embedded BeverageComposition object
    private BeverageComposition beverage;
    private String roastType;
    private boolean decaf;

    public CoffeeComposition(String roastType, int size, boolean decaf, double price) {
        // Construct the embedded Beverage object
        this.beverage = new BeverageComposition("coffee", size, price);
        this.roastType = roastType;
        this.decaf = decaf;
    }

    // The CoffeeComposition class's getName() calls the embedded object's getName()
    public String getName() {
        return beverage.getName();
    }

    // The CoffeeComposition class's getSize() calls the embedded object's getSize()
    public int getSize() {
        return beverage.getSize();
    }

    // The CoffeeComposition class's getPrice() calls the embedded object's
    // getPrice()
    public double getPrice() {
        return beverage.getPrice();
    }

    public String getRoastType() {
        return roastType;
    }

    public boolean isDecaf() {
        return decaf;
    }

    public String toString() {
        // Calls to accessor methods to access data
        // in embedded BeverageComposition object
        String item = roastType + " coffee (" + getSize() + " ml) " + beverage.PriceFormat.format(getPrice());
        if (decaf) {
            return "decaf " + item;
        } else {
            return item;
        }
    }
}