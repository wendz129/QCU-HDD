// Define the Animal interface
public interface Animal {
    boolean eat();
    void makeSound();
    void sleep();
}
//  Gorilla class implementing the Animal interface
public class Gorilla implements Animal {
    private String name;
    private int age;

    // Constructor for Gorilla class
    public Gorilla(String name, int age) {
        // Initialization code if necessary
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    // Method for the gorilla to eat
     @Override
    public boolean eat() {
        System.out.println("Putting gorilla food into the cage.");
        // Assuming feeding is always successful
        return true;  // Return true indicating successful feeding 
    }

    // Method for the gorilla to sleep
    @Override
    public void sleep() {
        System.out.println("The gorilla is sleeping now.");

    }
    @Override
    public void makeSound() {
        System.out.println("The gorilla roars loudly!");
    }

    // Additional method specific to Gorilla
    // public void climb() {
    //     System.out.println("The gorilla climb in the trees.");
    // }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Create a new Gorilla instance and demonstrate the methods
        Gorilla gorilla = new Gorilla("Kong", 5);

        // Feed the gorilla and capture the result
        boolean feedSuccess = gorilla.eat();
        if (feedSuccess) {
            System.out.println(gorilla.getName() + "has been successfully fed.");
        } else {
            System.out.println("Failed to feed " + gorilla.getName());
        }

        // Gorilla actions
        gorilla.makeSound();    // Output: The gorilla roars loudly! -- The gorilla grunts!
        gorilla.sleep();        // Output: The gorilla is sleeping now. -The gorilla sleeps in the trees.
        
    }
}