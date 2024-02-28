package DiceGames.crapsextented;

import java.util.Scanner;

public class Player {

    private Die diceOne = new Die();
    private Die diceTwo = new Die();

    private boolean playerWon(int point, int currentPoint)
    {
        boolean won;
        // Spilleren vinder med det samme, hvis det første kast er 7 eller 11.
        if (point == 7 || point == 11)
        {
            won = true;
        }
        // Kaster han sit ’point’, har han vundet
        else if (point == currentPoint)
        {
             won = true;
        }
        else {
             won = false;
        }
        return won;
    }

    private boolean playerLost(int point, int currentPoint)
    {
        boolean lost;
        // Taber med det samme, hvis det første kast er 2, 3 eller 12
        if (point == 2 || point == 3 || point == 12)
        {
            lost = true;
        }
        // Kaster han 7, har han tabt.
        else if (currentPoint == 7)
        {
            lost = true;
        }
        else {
            lost = false;
        }
        return lost;
    }


    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean pigIsPlaying = true;

        System.out.println("Come out roll");
        scanner.nextLine();
        int currentPoint = 0;
        int rollCount = 0;
        int point = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        while (pigIsPlaying)
        {
            diceOne.roll(); // Roll diceOne
            diceTwo.roll(); // Roll diceTwo
            rollCount++;

            if (rollCount == 1) // First roll
            {
                point = diceOne.getFaceValue() + diceTwo.getFaceValue();
                System.out.printf("Rolling... %d\n", point);
            }
            else // Next rolls
            {
                currentPoint = diceOne.getFaceValue() + diceTwo.getFaceValue();
                System.out.printf("Rolling... %d\n", currentPoint);
            }

            if (playerWon(point, currentPoint) || playerLost(point, currentPoint))
            {
                if (playerWon(point, currentPoint))
                {
                    System.out.println("Player won");
                    gamesWon++;
                }
                else if (playerLost(point, currentPoint))
                {
                    System.out.println("Player lost");
                    gamesLost++;
                }
                System.out.println("Do you want to play again? (y/n)");
                if (scanner.nextLine().equalsIgnoreCase("n")) {
                    System.out.printf("You WON %d round(s) and LOST %d round(s)\n", gamesWon, gamesLost);
                    pigIsPlaying = false;
                }
            }
            else
            {
                System.out.println("Roll again");
                scanner.nextLine();
            }
        }
    }
}
