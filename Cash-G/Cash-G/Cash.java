public class Cash{
    public static void main(String[] args) {

        int Cash = 50;

        System.out.println("Cash in: " + Cash);
    } 
}

/**
 * import java.util.ArrayList;
import java.util.List;

class Transaction {
    private String type;   // e.g., "Send", "Receive", "Pay Bill"
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return type + " ₱" + amount;
    }
}

class User {
    private String userId;
    private String name;
    private List<Transaction> transactions;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public void viewTransactions() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Transactions:");
        for (Transaction t : transactions) {
            System.out.println(" - " + t);
        }
    }
}

public class GCashApp {
    public static void main(String[] args) {
        User user1 = new User("GC12345", "Juan Dela Cruz");

        user1.addTransaction("Send Money", 500.00);
        user1.addTransaction("Receive Money", 1000.00);
        user1.addTransaction("Pay Bill", 300.00);

        user1.viewTransactions();
    }
}**/