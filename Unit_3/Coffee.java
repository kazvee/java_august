public class Coffee implements Beverage {
    private String roastType;
    private int size;
    private boolean decaf;
    private double price;

    public Coffee(String roastType, int size, boolean decaf, double price) {
        this.roastType = roastType;
        this.size = size;
        this.decaf = decaf;
        this.price = price;
    }

    // Required by Beverage interface
    public String getName() {
        return "coffee";
    }

    // Required by Beverage interface
    public int getSize() {
        return size;
    }

    // Required by Beverage interface
    public double getPrice() {
        return price;
    }

    public boolean isDecaf() {
        return decaf;
    }

    @Override // toString inherited from Java Object base class
    public String toString() {
        // PriceFormat is constant provided by Beverage interface
        String item = roastType + " coffee (" + size + " ml) " + PriceFormat.format(price);
        if (decaf) {
            return "decaf " + item;
        } else {
            return item;
        }
    }
}