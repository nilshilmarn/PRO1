package DiceGames.pig;

import java.util.Scanner;

public class Player {


    private Die die;
    private int points;

    public Player()
    {
        die = new Die();
    }

    public int getPoints()
    {
        return points;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Points: " + points);
        System.out.println("Roll");
        scanner.nextLine();
        boolean playerTurn = true;
        int sum = 0; // Initilize the start sum to zero
        while (playerTurn)
        {
            die.roll(); // Roll the die
            sum += die.getFaceValue(); // Add the facevalue to the sum
            System.out.printf("Rolling... %d\n", die.getFaceValue());
            System.out.println("Round Points: " + sum);
            if (die.getFaceValue() == 1) // If the die value equals 1 -> print out points and break players turn.
            {
                System.out.println("Points: " + points);
                playerTurn = false;
            }
            else
            {
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
                if (again.toLowerCase().equals("n"))
                {
                    points += sum; // Add the sum to the point
                    System.out.println("Points: " + points);
                    playerTurn = false;
                }
            }
        }
    }
}
