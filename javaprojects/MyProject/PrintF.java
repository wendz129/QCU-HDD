// it's really helpful ?
public class PrintF {
    public static void main(String[] args) {
        
        // - printf() = is a method used to format output

        // - %[flags][width][.precision][specifier-character]

        // String name = "Wendell!";
        // char firstLetter = 'W';
        // int age = 27;
        // double height = 60.5;
        // boolean isEmployed = true;

        // System.out.printf("Hello %s\n", name); // s for strings
        // System.out.printf(" Your name starts with a %c\n", firstLetter); // c char
        // System.out.printf("You are %d years old\n", age); // d for int
        // System.out.printf("You are %f inches tall\n", height); //f for double or other floating numbers 
        // System.out.printf("Employed: %b\n", isEmployed); // b for booleans

        // System.out.printf("%s is %d years old", name, age);

        // double price1 = 9.99;
        // double price2 = 100.15;
        // double price3 = -54.01;

        // - [flags] 
        // this symbol (-) means comment only

        // - + = output a plus
        // - , = comma grouping separator
        // - ( = negative numbers are enclosed in ()
        // - space = display a minus if negative, space if positive

        // double price1 = 9.99;
        // double price2 = 100.15;
        // double price3 = -54.01;

        // System.out.printf("%f", price1);
        // System.out.printf("%f", price2);
        // System.out.printf("%f", price3);

        // System.out.printf("%f\n", price1);
        // System.out.printf("%f\n", price2);
        // System.out.printf("%f\n", price3);

        // System.out.printf("%.1f\n", price1);
        // System.out.printf("%.1f\n", price2);
        // System.out.printf("%.1f\n", price3);

        // System.out.printf("%+,.2f\n", price1);
        // System.out.printf("%+,.2f\n", price2);
        // System.out.printf("%+,.2f\n", price3);

        // System.out.printf("%(.2f\n", price1);
        // System.out.printf("%(.2f\n", price2);
        // System.out.printf("%(.2f\n", price3);

        // System.out.printf("% .2f\n", price1);
        // System.out.printf("% .2f\n", price2);
        // System.out.printf("% .2f\n", price3); with space

        // - [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // System.out.printf("%d", id1);
        // System.out.printf("%d", id2);
        // System.out.printf("%d", id3);
        // System.out.printf("%d", id4);

        // System.out.printf("%d\n", id1);
        // System.out.printf("%d\n", id2);
        // System.out.printf("%d\n", id3);
        // System.out.printf("%d\n", id4);

        // System.out.printf("%04d\n", id1);
        // System.out.printf("%04d\n", id2);
        // System.out.printf("%04d\n", id3);
        // System.out.printf("%04d\n", id4);


        // System.out.printf("%4d\n", id1);
        // System.out.printf("%4d\n", id2);
        // System.out.printf("%4d\n", id3);
        // System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

    }
}