public class ArithmeticShorcuts {
    /**
     * Java created a cool shortcut for self-arithmetic operations.

        For example instead of writing:

        int a = 5;
        a = a + 3; // a holds 8
     */

    /**
        * We can simplify it by writing +=:

            int a = 5;
            a += 3; // a holds 8

            The += is adding to a itself the value 3
        **/
    /**
            This operation is valid for all arithmetic operations:
    Operator	Shortcut
        +     |     +=
        -     |     -=
        *     |     *=
        /     |     /=
        %     |     %=
     */
    public static void main(String[] args) {
        int count = 0;

        // Type your code below
        count += 4; // count = count + 4
        count *= 2; // count = count * 2
        count -= 1; // count = count - 1

        // Don't modify the code below
        System.out.println("Results of Arithmetic Shortcuts:");
        System.out.println("count = " + count);
    }
}