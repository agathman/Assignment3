public class Item {
    private int itemCode;
    private String name;

    public Item(int a, String b) {
        itemCode = a;
        name = b;
    }

    public void displayItem() {
        System.out.println("\nItem code: " + itemCode);
        System.out.println("Item Name: " + name);
    }

}
