import java.util.Scanner;

public class Task113 {

    public static void main(String[] args){
        // Create a Scanner object for reading input 
        Scanner scanner = new Scanner(System.in);

        System.out.println("System.in");

        //Ask for the user's name
        System.out.println("What's your name?");
        String name = scanner.nextLine(); // Read the name

        //Ask for the user's age
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Read the age

        // Display the user's input
        System.out.println("Hello " + name + "! Your are " + age + " years old!" );

        scanner.close();
    }
}