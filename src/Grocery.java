public class Grocery extends Item implements Discount, Tax{

    private double price;
    private double units;
    private double discount;

    public Grocery(int a, String b, double unt, double prc, double dis) {
        super(a, b);
        price = prc;
        units = unt;
        discount = dis;
    }
   public double computeDiscount() {
       double dis = (price * units) * (discount/100.0);
       return dis;
    }

    public double computeTax() {
        double tax = 0;
        return tax;
    }
    public double computeSubTotal() {
        double sub = (price * units) - computeDiscount();
        return sub;
    }

    double computeTotalPrice() {

        double total =  (price * units) - computeDiscount();
        return total;

    }
    public void displayGrocery() {
    displayItem();
    System.out.println("Unit Price: $" + price);
    System.out.println("Units: " + units);
    System.out.println("Savings: $" + computeDiscount());
    System.out.println("Subtotal: $" + computeSubTotal());
    System.out.println("Tax: $" + computeTax());
    System.out.println("Total: $" + computeTotalPrice());
    }
}
