
import java.util.ArrayList;
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

    public void viewTransaction() {
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
        User user1 = new User("GC12199709", "Wendell Villamor Rosete");

        user1.addTransaction("Send Money", 500.00);
        user1.addTransaction("Receive Money", 1000000);
        user1.addTransaction("Pay Bill", 3000);

        user1.viewTransaction();
    }
}
// import java.util.List;

// class Transaction {
//     private String type;   // e.g., "Send", "Receive", "Pay Bill"
//     private double amount;

//     public Transaction(String type, double amount) {
//         this.type = type;
//         this.amount = amount;
//     }

//     @Override
//     public String toString() {
//         return type + " ₱" + amount;
//     }
// }

// class User {
//     private String userId;
//     private String name;
//     private List<Transaction> transactions;

//     public User(String userId, String name) {
//         this.userId = userId;
//         this.name = name;
//         this.transactions = new ArrayList<>();
//     }

//     public void addTransaction(String type, double amount) {
//         transactions.add(new Transaction(type, amount));
//     }

//     public void viewTransactions() {
//         System.out.println("User ID: " + userId);
//         System.out.println("Name: " + name);
//         System.out.println("Transactions:");
//         for (Transaction t : transactions) {
//             System.out.println(" - " + t);
//         }
//     }
// }

// public class GCashApp {
//     public static void main(String[] args) {
//         User user1 = new User("GC12345", "Juan Dela Cruz");

//         user1.addTransaction("Send Money", 500.00);
//         user1.addTransaction("Receive Money", 1000.00);
//         user1.addTransaction("Pay Bill", 300.00);

//         user1.viewTransactions();
//     }
// }**/

//   import java.util.ArrayList;
//   import java.util.List;

// class Transaction {
//     private String type;  // e.g., "Send", "Recieve", "Pay Bill"
//     private double amount;

//     public Transaction(String type, double amount) {
//         this.type = type;
//         this.amount = amount;
//     }

//     @Override
//     public String toString() {
//         return type + "₱" + amount;
//     }
// }
// class User {
//     public String userId;
//     private String name;
//     private List<Transaction> transactions;
// }   
// public User(String userId, String name) {
//     this.userId = userId;
//     this.name = name;
//     this.transactions = new ArrayList<>();
// }
//     public void addTransaction(String type, double amount) {
//         transaction.add(new Transaction(type, amouunt));
//     }
//     public void viewTransactions() {
//         System.out.println("User ID: " + userId);
//         System.out.println("Name: " + name);
//         System.out.println("Transactions:");
//         for (Transaction t : transactions) {
//             System.out.println(" - " + t);
//         }
//     }
    
// public class GCashApp {
//     public static void main(String[] args) {
//         user user1 = new User("GC12345", "Juan Dela cruz");

//         user1.addTransaction("Send Money", 500.00);
//         user1.addTransaction("Recieve Money", 1000.00);
//         user1.addTransaction("Pay Bill", 300.00);

//         user1.viewTransactions();
//     }
// }