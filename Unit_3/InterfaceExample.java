class InterfaceExample {
    public static void main(String[] args) {
        // Create order and add drinks
        DrinkOrder toGoOrder = new DrinkOrder();
        Coffee coffee = new Coffee("dark roast", 350, false, 4.49);
        toGoOrder.add(coffee);
        Tea greenTea = new Tea("green", 200, false, 2.59);
        toGoOrder.add(greenTea);
        Tea blackTea = new Tea("black", 150, true, 2.39);
        toGoOrder.add(blackTea);
        // Number to use for numbered list of drinks in order
        int itemNumber = 1;
        System.out.println("Here is your order: ");
        // getOrder() returns ArrayList<Beverage>
        for (Beverage bev : toGoOrder.getOrder()) {
            System.out.println("\t" + itemNumber++ + ". " + bev);
        }

        System.out.println("\nOrder Total: " +
        // Note how Beverage.PriceFormat can be used here, too
                Beverage.PriceFormat.format(toGoOrder.getTotalPrice()));
    }
}
