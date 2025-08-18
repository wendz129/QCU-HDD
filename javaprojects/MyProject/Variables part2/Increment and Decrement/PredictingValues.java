/** Post Increment/Decrement

Increment (++) and Decrement (--) operators can be used in two ways:

Pre-increment/decrement (++x or --x):

The operator goes BEFORE the variable
The value changes IMMEDIATELY
The new value is used in the expression

int x = 5;
int y = ++x; **/
// x is increased to 6 first, then y becomes 6


/** Post-increment/decrement (x++ or x--):

The operator goes AFTER the variable
The original value is used first
The value changes AFTER the expression

int x = 5;
int y = x++;
// y becomes 5 first, then x increases to 6
Another example

post-increment:

int score = 5;

int res1 = score++;
// res1 is 5
// score is 6
pre-increment:

int score = 5;

int result2 = ++score;
**/
// res is 6
// score is 6

public class PredictingValues {
    public static void main(String[] args) {
        // Initial values

        int point = 5;
        int bonus = 10;
        int lives = 3;

        // Predict the values
        int result1 = point++; 
        // what is the result? what is points now? 
        int result2 = ++bonus;
        // what is the result? what is bonus now?
        int result3 = --lives;
        // what is the result? what is lives now?
        int result4 = lives--; 
        // what is the result? what is lives now?

        // Fill in your prediction
        int finalPoints = 6;    // Final value of points
        int finalBonus = 11;     // Final value of bonus
        int finalLives = 1;     // Final value of lives

        // Don't modify the code below
        System.out.println("Results of Operations:");
        System.out.println("---------------------");
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("\nFinal Values:");
        System.out.println("-------------");
        System.out.println("points = " + finalPoints);
        System.out.println("bonus = " + finalBonus);
        System.out.println("lives = " + finalLives);
    }
}