package DiceGames.rolltwodice;

import java.util.Scanner;

public class Player {

   private Die diceOne;
   private Die diceTwo;
   private int rollCount;
   private int sameFaceValue;
   private int largestSum = 0;
   private int[] occurrence = new int[7];
   private double totalSum;


    public Player()
    {
       diceOne = new Die();
       diceTwo = new Die();
    }

    public int getRollCount()
    {
        return rollCount;
    }

    public int getSameFaceValue()
    {
        return sameFaceValue;
    }

    public int getLargestSum()
    {
        return largestSum;
    }

    public void printOccurrence()
    {
        for (int i = 1; i < occurrence.length; i++)
        {
            System.out.printf("Facevalue: %d - occurence: %d \n", i, occurrence[i]);
        }
    }



    public double getAverageSum()
    {
        // Udvid programmet, så den totale sum af alle terningkastene også udskrives, når spillet
        // afsluttes
        return totalSum / rollCount;
    }

    public void throwDie()
    {
        diceOne.roll();
        diceTwo.roll();
        rollCount++;


        // Hvor mange gange de to terninger i et kast har vist det samme antal øjne
        if(diceOne.getFaceValue() == diceTwo.getFaceValue())
        {
            sameFaceValue++;
        }

        // Det største sum, der er opnået i ét kast med de to terninger
        if(diceOne.getFaceValue() + diceTwo.getFaceValue() > largestSum)
        {
            largestSum = diceOne.getFaceValue() + diceTwo.getFaceValue();
        }

        // Antal gange 1’ere, 2’ere, ..., 6’ere er forekommet tilsammen i alle kastene
        occurrence[diceOne.getFaceValue()]++;
        occurrence[diceTwo.getFaceValue()]++;

        // Den gennemsnitlige sum i alle kastene
        totalSum += diceOne.getFaceValue() + diceTwo.getFaceValue();

    }



    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll?");
        scanner.nextLine();
        boolean finished = false;
        while (!finished) {
            throwDie();
            System.out.printf("Rolling... %d and %d\n", diceOne.getFaceValue(), diceTwo.getFaceValue());
            System.out.println("Roll again? (Y/n)");
            String again = scanner.nextLine();
            if (again.toLowerCase().equals("n")) {
                finished = true;
            }
        }
    }

}
