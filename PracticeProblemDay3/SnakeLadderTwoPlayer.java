import java.util.*;
public class SnakeLadderTwoPlayer{
    public static void main(String args[]){

        Random rand = new Random();

        int player1 = 0;
        int player2 = 0;

        while (true) {

            int dice = rand.nextInt(6) + 1;
            System.out.println("Player 1 rolled: " + dice);

            if (player1 + dice <= 100) {
                player1 = player1 + dice;
            }

            System.out.println("Position of player 1: " + player1);

            if (dice == 6) {
                System.out.println("Player 1 got a ladder");
                continue;
            }

            if (player1 == 100) {
                System.out.println(" Player 1 has won ");
                break;
            }

            dice = rand.nextInt(6) + 1;
            System.out.println("\nPlayer 2 rolled: " + dice);

            if (player2 + dice <= 100) {
                player2 = player2 + dice;
            }

            System.out.println("Position of player 2: " + player2);

            if (dice == 6) {
                System.out.println("Player 2 got a ladder.");
                continue;
            }

            if (player2 == 100) {
                System.out.println(" Player 2 has won");
                break;
            }
        }
    }
}