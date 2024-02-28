package DiceGames.rolltwodice;

import java.util.Arrays;

public class RollTwoDiceGame {

    public static void main(String[] args) {
        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Plying RollTwoDice.");
        player.play();

        printResults(player);
        System.out.println();

        System.out.println("Thank you for playing RollTwoDice.");
    }

    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of RollTwoDice:");
        System.out.println("The player throws two dice as long as he/she wants.");
        System.out.println("=====================================================");
    }

    public static void printResults(Player player) {
        System.out.println("Results");
        System.out.println("-------");
        System.out.println("Roll count: " + player.getRollCount());
        System.out.println("Same facevalues count: " + player.getSameFaceValue());
        System.out.println("Largest sum: " + player.getLargestSum());
        player.printOccurrence();
        System.out.printf("Average sum: %.2f", player.getAverageSum());
    }
}
