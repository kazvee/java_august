public class TeaComposition {
    private BeverageComposition beverage;
    private String teaType;
    private boolean iced;

    public TeaComposition(String teaType, int size, boolean iced, double price) {
        // Construct the embedded BeverageComposition object
        this.beverage = new BeverageComposition("tea", size, price);
        this.teaType = teaType;
        this.iced = iced;
    }

    // The TeaComposition class's getName() calls the embedded object's getName()
    public String getName() {
        return beverage.getName();
    }

    // The TeaComposition class's getSize() calls the embedded object's getSize()
    public int getSize() {
        return beverage.getSize();
    }

    // The TeaComposition class's getPrice() calls the embedded object's getPrice()
    public double getPrice() {
        return beverage.getPrice();
    }

    public String getTeaType() {
        return teaType;
    }

    public boolean isIced() {
        return iced;
    }

    public String toString() {
        // Calls to accessor methods to access data
        // in embedded BeverageComposition object
        String item = teaType + " tea (" + getSize() + " ml) " + beverage.PriceFormat.format(getPrice());
        if (iced) {
            return "iced " + item;
        } else {
            return "hot " + item;
        }
    }
}