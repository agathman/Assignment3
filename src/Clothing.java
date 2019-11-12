public class Clothing extends Item implements Discount, Tax{
    private String brand;
    private double price;
    private double units;
    private double discount;
    final double taxp = 8.5;

    public Clothing(int a, String b, double units, double price,String brand, double d) {
        super(a, b);
        this.brand = brand;
        this.price = price;
        this.units = units;
        discount = d;

    }
    public double computeDiscount() {
        double dis = (price * units) * (discount/100.0);
        return dis;
    }
    public double computeSubTotal() {
        double sub = (price * units) - computeDiscount();
        return sub;
    }
    public double computeTax() {
        double tax = (price * units) * (taxp/100);
        return tax;
    }
    double computeTotalPrice() {
        double total =  (price * units) - computeDiscount() + computeTax();
        return total;

    }
    public void displayClothing() {
        displayItem();
        System.out.println("Units: " + units);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Savings: $" + computeDiscount());
        System.out.println("Subtotal: $" + computeSubTotal());
        System.out.println("Tax: $" + computeTax());
        System.out.println("Total: $" + computeTotalPrice());
    }
 }
