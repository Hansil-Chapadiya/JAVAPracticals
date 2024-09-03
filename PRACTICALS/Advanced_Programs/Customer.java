// public class Customer extends Thread {
//     private String name;
//     private String productName;
//     private static int productQuantity = 10; // Initial quantity of the product

//     public Customer(String name, String productName) {
//         this.name = name;
//         this.productName = productName;
//     }

//     @Override
//     public void run() {
//         synchronized (Customer.class) { // Synchronize on the class object to ensure atomic access to shared variable
//             if (productQuantity > 0) { // Check if product is available
//                 System.out.println(name + " is buying " + productName);
//                 productQuantity--; // Decrease product quantity
//                 System.out.println(productName + " purchased by " + name + ". Remaining quantity: " + productQuantity);
//             } else {
//                 System.out.println("Sorry, " + productName + " is out of stock for " + name);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Create two customers trying to buy the same product
//         Customer customer1 = new Customer("Customer1", "ProductA");
//         Customer customer2 = new Customer("Customer2", "ProductA");

//         // Start the threads
//         customer1.start();
//         customer2.start();
//     }
// }

public class Customer extends Thread {
    private String name;
    private String bankName;
    private static double accountBalance = 1000.0; // Initial balance in the account

    public Customer(String name, String bankName) {
        this.name = name;
        this.bankName = bankName;
    }

    @Override
    public void run() {
        synchronized (Customer.class) { // Synchronize on the class object to ensure atomic access to shared variable
            double withdrawAmount = 500.0; // Amount to withdraw
            if (withdrawAmount > accountBalance) {
                System.out.println("Sorry, " + bankName + " has insufficient balance for " + name + " to withdraw.");
            } else {
                System.out.println(name + " is withdrawing " + withdrawAmount + " from " + bankName);
                accountBalance -= withdrawAmount; // Decrease account balance
                System.out.println("Withdrawal successful! New balance for " + bankName + ": " + accountBalance);
            }
        }
    }

    public static void main(String[] args) {
        // Create two customers trying to withdraw from the same bank account
        Customer customer1 = new Customer("Customer1", "BankA");
        Customer customer2 = new Customer("Customer2", "BankA");

        // Start the threads
        customer1.start();
        customer2.start();
    }
}

