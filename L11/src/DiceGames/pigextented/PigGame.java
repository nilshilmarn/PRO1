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

    }


    public static void pigGameStart(Player playerOne, Player playerTwo, int winningPoints)
    {
        boolean won = false;
        int playerOneTurnCount = 0;
        int playerTwoTurnCount = 0;

        while (!won) // Game stops if one of the playres gets 100+
        {
            System.out.println("Player One's Turn");
            playerOne.play();
            playerOneTurnCount++;
            System.out.println();

            if (playerOne.getPoints() < winningPoints)
            {
                System.out.println("Player Two's Turn");
                playerTwo.play();
                playerTwoTurnCount++;
                System.out.println();
            }
            if (playerOne.getPoints() >= winningPoints || playerTwo.getPoints() >= winningPoints)
            {
                won = true;
            }
        }
        printResults(playerOne, playerTwo, winningPoints, playerOneTurnCount, playerTwoTurnCount);
    }

    public static void printResults(Player playerOne, Player playerTwo, int winningPoints, int playerOneTurnCount, int playerTwoTurnCount)
    {
        double playerOneAverageThrows = (double) playerOne.getThrowCount() / playerOneTurnCount;
        double playerTwoAverageThrows = (double) playerTwo.getThrowCount() / playerTwoTurnCount;

        System.out.println("Results");
        System.out.println("-------");
        if (playerOne.getPoints() >= winningPoints)
        {
            System.out.println("Player One - Won");
            System.out.println("Player One - Points: " + playerOne.getPoints());
            System.out.printf("Player One - Average Rolls: %.2f\n", playerOneAverageThrows);
            System.out.println("Player Two - Points: " + playerTwo.getPoints());
            System.out.printf("Player Two - Average Rolls: %.2f", playerTwoAverageThrows);

        }
        else
        {
            System.out.println("Player Two - Won");
            System.out.println("Player Two - Points: " + playerTwo.getPoints());
            System.out.printf("Player Two - Average Rolls: %.2f\n", playerTwoAverageThrows);
            System.out.println("Player One - Points: " + playerOne.getPoints());
            System.out.printf("Player One - Average Rolls: %.2f", playerOneAverageThrows);
        }

    }

}
