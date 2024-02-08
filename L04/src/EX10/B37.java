package EX10;

import java.util.Scanner;


public class B37 {

    public static void main(String[] args) {

        System.out.println("Welcome to Scissor, Rock, Paper");
        System.out.println("Enter a value for for which handweapon you'd like:");
        System.out.print("scissor (0), rock (1), paper (2): ");

        Scanner input = new Scanner(System.in);

        // Storing the player input (weapon)
        int player = input.nextInt();

        if (player < 0 || player > 2)
        {
            return;
        }

        String[] weapon = {"scissor", "rock", "paper"};

        // N - R
        // 0 - 0 Tie
        // 1 - 1 Tie
        // 2 - 2 Tie
        // 0 - 2 Won
        // 1 - 0 Won
        // 2 - 1 Win
        // 0 - 1 Lost
        // 1 - 2 Lost
        // 2 - 0 Lost

        // Genereate a random number between 0 and 2
        int computer = (int) (Math.random() * 3);

        // Print which weapon the computer picked
        System.out.printf("The computer picked %s. ", weapon[computer]);

        if (player == computer) // It's a tie
        {
            System.out.printf("You are %s too. It is a draw.", weapon[player]);
        }
        else if (player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1)
        {
            System.out.printf("You are %s. You win.", weapon[player]);
        }
        else
        {
            System.out.printf("You are %s. You lost.", weapon[player]);
        }



    }


}
