package DiceGames.crapsextented;

import java.util.Scanner;

public class Player {

    private Die diceOne = new Die();
    private Die diceTwo = new Die();

    private boolean winningConditions(int point, int currentPoint)
    {
        boolean won;
        // Spilleren vinder med det samme, hvis det første kast er 7 eller 11.
        if (point == 7 || point == 11)
        {
            System.out.println("Player won");
            won = true;
        }
        // Kaster han sit ’point’, har han vundet
        else if (point == currentPoint)
        {
            System.out.println("Player won");
             won = true;
        }
        else {
             won = false;
        }
        return won;
    }

    private boolean losingConditions(int point, int currentPoint)
    {
        boolean lost;
        // Taber med det samme, hvis det første kast er 2, 3 eller 12
        if (point == 2 || point == 3 || point == 12)
        {
            System.out.println("Player lost");
            lost = true;
        }
        // Kaster han 7, har han tabt.
        else if (currentPoint == 7)
        {
            System.out.println("Player lost");
            lost = true;
        }
        else {
            lost = false;
        }
        return lost;
    }


    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Come out roll");
        scanner.nextLine();
        boolean finished = false;
        int currentPoint = 0;
        int rollCount = 0;
        int point = 0;
        while (!finished) {
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

            if (winningConditions(point, currentPoint) || losingConditions(point, currentPoint)) // Check if the player loses or wins.
            {
                System.out.println("Do you want to play again? (y/n)");
                String playAgain = scanner.nextLine();
                if (playAgain.toLowerCase().equals("n")) {
                    finished = true;
                }
                else {
                    play(); // Play again
                }
            }
            else // Roll again
            {
                System.out.println("Roll again");
                String again = scanner.nextLine();
            }
        }
    }
}
