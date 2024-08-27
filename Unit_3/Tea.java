public class Tea implements Beverage {
    private String teaType;
    private int size;
    private boolean iced;
    private double price;

    public Tea(String teaType, int size, boolean iced, double price) {
        this.teaType = teaType;
        this.size = size;
        this.iced = iced;
        this.price = price;
    }

    public String getName() {
        return "tea";
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean isIced() {
        return iced;
    }

    public String toString() {
        String item = teaType + " tea (" + size + " ml) " + PriceFormat.format(price);
        if (iced) {
            return "iced " + item;
        } else {
            return "hot " + item;
        }
    }
}