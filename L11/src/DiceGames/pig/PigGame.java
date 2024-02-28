package DiceGames.pig;

public class PigGame {

    public static void main(String[] args)
    {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        System.out.println("Flying Pig.");
        System.out.println();

        pigGame(playerOne, playerTwo);
        printResults(playerOne, playerTwo);
    }


    public static void pigGame(Player playerOne, Player playerTwo)
    {
        boolean won = false;

        while (!won) // Game stops if one of the playres gets 100+
        {
            System.out.println("Player One's Turn");
            playerOne.play();
            System.out.println();

            if (playerOne.getPoints() < 100)
            {
                System.out.println("Player Two's Turn");
                playerTwo.play();
                System.out.println();
            }
            if (playerOne.getPoints() >= 100 || playerTwo.getPoints() >= 100)
            {
                won = true;
            }
        }
    }

    public static void printResults(Player playerOne, Player playerTwo)
    {
        System.out.println("Results");
        System.out.println("-------");
        if (playerOne.getPoints() >= 100)
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
