public class demoDepartmentBilling {

    public static void main(String[] args) {
        Grocery g1 = new Grocery(11, "Bread", 2.0, 1.5, 0);
        Grocery g2 = new Grocery(12,"Apple", 6.0, 0.75, 1.0);

        Clothing c1 = new Clothing(21, "Jeans", 1.0, 35.0, "Levis", 0);
        Clothing c2 = new Clothing(22, "Dress Shirt", 2.0, 25.0, "Izod", 10.0);

        double grandTotal = g1.computeTotalPrice() + g2.computeTotalPrice() + c1.computeTotalPrice() + c2.computeTotalPrice();

        g1.displayGrocery();
        g2.displayGrocery();

        c1.displayClothing();
        c2.displayClothing();

        System.out.println("\nTotal Bill amount: $" + grandTotal);
    }
}
