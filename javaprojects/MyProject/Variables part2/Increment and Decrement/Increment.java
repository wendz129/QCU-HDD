public class Increment {
    /**
     * Increment and decrement operators are used to increase or decrease the value of a variable by 1. These operators are widely used in programming, especially in loops and counters.
        The increment operator is represented by two plus signs ++, and the decrement operator is represented by two minus signs --.
        For example, to increment a variable named count, you can use the increment operator like this:
     */
    public static void main(String[] args) {
        int count = 5;
        // int value = 10; // Similarly, to decrement a variable named value, you can use the decrement operator like this:
        // count++; 
        // value--;
        // int count = 0;
        count++;
        count++;
        count++;
        count++;
        count = count * 2;
        count--; // output will be 7

        /**
         *
            Your task is to add the following operations, in this order:

            Use the increment operator (++) four times to add 4 to count
            Use the multiplication operator (*) to multiply count by 2
            Use the decrement operator (--) once to subtract 1 from count
         */

        System.out.println("count = " + count);
    }
}