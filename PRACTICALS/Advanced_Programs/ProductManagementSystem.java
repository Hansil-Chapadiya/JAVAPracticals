import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class ProductManagementSystem {
    private static Product product;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Set MRP and Quantity for the product");
            System.out.println("2. Buy a product");
            System.out.println("3. Search for a product");
            System.out.println("4. Delete a product from storage");
            System.out.println("5. Show stored object data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    setProductDetails(scanner);
                    break;
                case 2:
                    buyProduct(scanner);
                    break;
                case 3:
                    searchProduct(scanner);
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    showStoredData();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void setProductDetails(Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.next();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();
        product = new Product(name, price, quantity);
        System.out.println("Product details set successfully.");
    }

    private static void buyProduct(Scanner scanner) {
        if (product == null) {
            System.out.println("Please set product details first.");
            return;
        }
        System.out.print("Enter quantity to buy: ");
        int quantityToBuy = scanner.nextInt();
        if (quantityToBuy > product.getQuantity()) {
            System.out.println("Insufficient quantity available.");
        } else {
            product.setQuantity(product.getQuantity() - quantityToBuy);
            System.out.println("Product bought successfully.");
        }
    }

    private static void searchProduct(Scanner scanner) {
        if (product == null) {
            System.out.println("Please set product details first.");
            return;
        }
        System.out.print("Enter product name to search: ");
        String name = scanner.next();
        if (name.equals(product.getName())) {
            System.out.println("Product found: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    private static void deleteProduct() {
        product = null;
        System.out.println("Product deleted from storage.");
    }

    private static void showStoredData() {
        if (product == null) {
            System.out.println("No product stored.");
        } else {
            System.out.println("Stored product data: " + product);
        }
    }
}
