import java.text.DecimalFormat; // Needed for DecimalFormat for price

public interface Beverage {
    // Shared constant for price format. Available to all classes
    // that implement the Beverage interface.
    final DecimalFormat PriceFormat = new DecimalFormat("$0.00");

    // Common methods
    String getName(); // Coffee, Tea, etc.

    int getSize(); // Size in millilitres

    double getPrice(); // Price in dollars
}