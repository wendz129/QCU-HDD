public class gameScoreTracker {
    // You're creating a simple game score tracker. The program starts with certain values and you need to update them using increment and decrement operators.

    /**
     * Challenge Easy
    You're creating a simple game score tracker. The program starts with certain values and you need to update them using increment and decrement operators.

    * You start with these initial values:
        lives = 3
        score = 100
        level = 1
        coins = 5
    * Perform these operations in order:
        Player lost 2 lives (use decrement twice)
        Player collected 3 coins (use increment three times)
        Player gained 1 life (use increment once)
        Player advanced to next level (use increment once)
        Player lost 4 coins (use decrement four times)
     */

    public static void main(String[] args) {
        // initial values 
        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;

        // Add your operation below to update the game status:
        lives--;
        lives--;
        coins++;
        coins++;
        coins++;
        lives++;
        level++;
        coins--;
        coins--;
        coins--;
        coins--;

        // Incrementing the score by 50 -- Don't modify the code below
        System.out.println("Game Status:");
        System.out.println("------------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level:" + level);
        System.out.println("Coins:" + coins);
        }
    }
    





    /**
     * public static void main(String[] args) {
        int playerScore = 0; // Initial score
        int highScore = 100; // High score to beat

        // Increment the player's score by 10
        playerScore += 10;
        System.out.println("Player Score after increment: " + playerScore);

        // Decrement the player's score by 5
        playerScore -= 5;
        System.out.println("Player Score after decrement: " + playerScore);

        // Check if the player has beaten the high score
        if (playerScore > highScore) {
            System.out.println("Congratulations! You've beaten the high score!");
        } else {
            System.out.println("Keep trying to beat the high score!");
        }
    }
}
     */