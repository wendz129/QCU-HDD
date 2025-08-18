public class TypeCasting {
    /**
     * Type casting is the process of converting a value from one data type to another.
     * In Java, we can convert integers to doubles, doubles to integers, and more. 
     * There are two types of casting: implicit (automatic) and explicit (manual) casting.
     * 
     * For example integer to double:

        Implicit (automatic) casting:

        int number = 5;
        double decimal = number; // automatically becomes 5.0

        // with calculation
        int x = 7;
        double result = x / 2.0; // result is 3.5

        Explicit (manual) Casting double to integer:

        double decimal = 9.7;
        int number = (int) decimal;  // becomes 9 (decimal part is truncated)

        // with calculation
        double price = 19.99;
        int roundedPrice = (int) price;  // becomes 19
     */

    public static void main(String[] args) {
        // Declare and initialize variables

        /**
         * Write a Java program that demonstrates type casting. Perform the following operations:

            Declare a double variable named price and initialize it with the value 99.99.
            Cast the price variable to an int and store the result in a new variable named intPrice.
            Print the values of price and intPrice, to the console.
         */
        double price = 99.99;
        int intPrice = 99;
        
        
        // Output the values
        System.out.println("Price: " + price);
        System.out.println("Int Price: " + intPrice);
    }
}