package DiceGames.pigextented;

import java.util.Scanner;

public class Player {


    private Die dieOne;
    private Die dieTwo;
    private int points;

    private int throwCount;

    public Player()
    {
        dieOne = new Die();
        dieTwo = new Die();
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
            dieOne.roll(); // Roll the first die
            dieTwo.roll(); // Roll the second die
            sum += dieOne.getFaceValue() + dieTwo.getFaceValue(); // Add the facevalues to the sum
            System.out.printf("Rolling... %d and %d\n", dieOne.getFaceValue(), dieTwo.getFaceValue());
            System.out.println("Round Points: " + sum);
            if (dieOne.getFaceValue() == 1 && dieTwo.getFaceValue() == 1) // Hvis der kastes (1,1), mistes alle point (også point opnået i tidligere runder)
            {
                points = 0;
                System.out.println("Points: " + points);
                playerTurn = false;
            }
            else if (dieOne.getFaceValue() == 1 || dieTwo.getFaceValue() == 1) // Hvis en af terningerne viser 1, mistes pointene opnået i den aktuelle runde
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
