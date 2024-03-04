package EX3;

import java.util.ArrayList;

public class Team
{

    private String name;
    private ArrayList<Player> players;

    public Team(String name)
    {
        this.name = name;
        players = new ArrayList<>();

    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Player> getPlayers()
    {
        return players;
    }


    public void addPlayer(Player p)
    {
        players.add(p);
    }

    public void printPlayers()
    {
        for (Player player : players)
        {
            System.out.println(player);
        }
    }

    public double calcAverageAge()
    {
        int numberOfPlayers = players.size();
        double totalAges = 0;

        for (Player player : players)
        {
            totalAges += player.getAge();
        }

        return (double) totalAges / numberOfPlayers;
    }

    public int calcTotalScore()
    {
        int totalScore = 0;

        for (Player player : players)
        {
            totalScore += player.getScore();
        }

        return totalScore;
    }

    public int calcOldPlayersScore(int ageLimit)
    {
        int totalScore = 0;

        for (Player player : players)
        {
            if (player.getAge() > ageLimit)
            {
                totalScore += player.getScore();
            }

        }
        return totalScore;
    }

    public int maxScore()
    {
        int maxScore = 0;

        for (Player player : players)
        {
            if (player.getScore() > maxScore)
            {
                maxScore = player.getScore();
            }
        }

        return maxScore;

    }

    public ArrayList<String> bestPlayerNames()
    {
        ArrayList<String> bestPlayerNames = new ArrayList<>();

        for (Player player : players)
        {
            if (player.getScore() >= maxScore())
            {
                bestPlayerNames.add(player.getName());
            }
        }

        return bestPlayerNames;

    }


    @Override
    public String toString()
    {
        return String.format("Team(%s)", name);
    }
}
