package DiceGames.crapsextented;

public class CrapsGame {


    public static void main(String[] args)
    {

        printRules();
        System.out.println();

        Player player = new Player();
        System.out.println("Plying Craps.");
        player.play();


        System.out.println("Thank you for playing Craps.");
    }





    public static void printRules() {
        System.out.println("=====================================================");
        System.out.println("Rules of Craps:");
        System.out.println("The game consists of a series of throws with two dice.");
        System.out.println("The outcome of a throw is the sum of the two dice's faces.");
        System.out.println("The initial throw is called the 'come out roll'");
        System.out.println("The player instantly wins if the first throw results in a total of 7 or 11,");
        System.out.println("and loses immediately if the total is 2, 3, or 12.");
        System.out.println("If the player's first throw results in 4, 5, 6, 8, 9, or 10,");
        System.out.println("this number becomes the player's 'point'.");
        System.out.println("The player then continues to throw until they either roll their 'point' again or roll a 7.");
        System.out.println("Rolling a 7 results in a loss, while rolling the 'point' leads to a win.");
        System.out.println("=====================================================");
    }

}
