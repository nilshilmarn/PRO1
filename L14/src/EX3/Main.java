package EX3;

public class Main
{

    public static void main(String[] args)
    {

        Player playerOne = new Player("PlayerOne", 1);
        Player playerTwo = new Player("PlayerTwo", 2);
        Player playerThree = new Player("PlayerThree", 3);
        Player playerFour = new Player("PlayerFour", 4);

        Team team = new Team("Team Name");


        team.addPlayer(playerOne);
        team.addPlayer(playerTwo);
        team.addPlayer(playerThree);
        team.addPlayer(playerFour);

        playerOne.setScore(1);
        playerTwo.setScore(2);
        playerThree.setScore(4);
        playerFour.setScore(4);


        team.printPlayers();

        System.out.println(team.calcAverageAge());

        System.out.println(team.calcOldPlayersScore(2));

        System.out.println(team.maxScore());

        System.out.println(team.bestPlayerNames());


    }

}
