import java.util.*;

class ShoppingCart {
    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    ShoppingCart addItem(String item, double price) {
        this.items.add(item);
        this.prices.add(price);
        return this;
    }

    void displayCart() {
        System.out.println("\nShopping Cart:");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - Rs." + prices.get(i));
            total += prices.get(i);
        }
        System.out.println("Total: Rs." + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Item Name: ");
            String item = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            cart.addItem(item, price);
        }

        cart.displayCart();
    }
}
