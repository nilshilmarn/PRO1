package DiceGames.pigextented;

import java.util.Scanner;
public class PigGame {

    public static void main(String[] args)
    {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        System.out.println("Flying Pig.");
        System.out.println();

        System.out.println("How many points do you want to play to?: ");
        Scanner input = new Scanner(System.in);
        int winningPoints = input.nextInt();

        pigGameStart(playerOne, playerTwo, winningPoints);
        printResults(playerOne, playerTwo, winningPoints);
    }


    public static void pigGameStart(Player playerOne, Player playerTwo, int winningPoints)
    {
        boolean won = false;

        while (!won) // Game stops if one of the playres gets 100+
        {
            System.out.println("Player One's Turn");
            playerOne.play();
            System.out.println();

            if (playerOne.getPoints() < winningPoints)
            {
                System.out.println("Player Two's Turn");
                playerTwo.play();
                System.out.println();
            }
            if (playerOne.getPoints() >= winningPoints || playerTwo.getPoints() >= winningPoints)
            {
                won = true;
            }
        }
    }

    public static void printResults(Player playerOne, Player playerTwo, int winningPoints)
    {
        System.out.println("Results");
        System.out.println("-------");
        if (playerOne.getPoints() >= winningPoints)
        {
            System.out.println("Player One - Won");
            System.out.println("Player One - Points: " + playerOne.getPoints());
            System.out.println("Player Two - Points: " + playerTwo.getPoints());
        }
        else
        {
            System.out.println("Player Two - Won");
            System.out.println("Player Two - Points: " + playerTwo.getPoints());
            System.out.println("Player One - Points: " + playerOne.getPoints());
        }

    }

}
