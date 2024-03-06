package EX4;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMMachine
{

    public static void main(String[] args)
    {

        // Create 10 accounts in an array with id 0, 1, . . . , 9,
        // and an initial balance of $100.

        ArrayList<Account> accounts = new ArrayList<>();

        for (int i = 0; i <= 9; i++)
        {
            accounts.add(new Account(i, 100));
        }

        // Interface
        while (true)
        {
            System.out.println("Enter an id");

            Scanner input = new Scanner(System.in);

            int accountID = input.nextInt();

            boolean menuOpen;

            if (accountID >= 0 && accountID <= 9)
            {
                menuOpen = true;
            } else
            {
                System.out.println("Enter a correct ID");
                menuOpen = false;
            }

            while (menuOpen)
            {
                System.out.println("1) view blance");
                System.out.println("2) vithdraw money");
                System.out.println("3) deposit money");
                System.out.println("4) exit");

                int menuOption = input.nextInt();

                // You can enter choice 1 for viewing the current balance,
                if (menuOption == 1)
                {
                    System.out.println(accounts.get(accountID).getBalance());
                }
                // 2 for withdraw- ing money,
                else if (menuOption == 2)
                {
                    System.out.println("How much do you want to withdraw?:");
                    accounts.get(accountID).withdraw(input.nextDouble());
                }
                // 3 for depositing money,
                else if (menuOption == 3)
                {
                    System.out.println("How much do you want to deposit?:");
                    accounts.get(accountID).deposit(input.nextDouble());
                }
                // and 4 for exiting the main menu
                else if (menuOption == 4)
                {
                    menuOpen = false;
                }

            }
        }

    }

}
