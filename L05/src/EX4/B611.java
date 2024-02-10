package EX4;

public class B611
{

    public static void main(String[] args)
    {

        printTable();

    }


    // 0 - 5000 -> CR = 6%
    // 5000 - 10.000 -> CR = 8%
    // 10.000+ -> CR = 10%

    /* Note that this is a graduated rate.
      The rate for the first $5,000 is at 6%,
      the next $5000 is at 8%,
      and the rest is at 10%.
      If your sales amounts to $25,000,
      the commission is 5,000 * 6% + 5,000 * 8% + 15,000 * 10% = 2,200.
     */

    public static void printTable()
    {

        double salesAmount = 1000;

        System.out.printf("Sales Amount   Commission \n");

        while (salesAmount <= 20000)
        {

            double commission = computeComission(salesAmount);

            System.out.printf("%-6.0f         %-6.1f\n", salesAmount, commission); // To left-align use "-".

            salesAmount += 1000;
        }

    }

    public static double computeComission(double salesAmount)
    {

        int baseSalary = 5000;

        double commission = 0;


        if ( salesAmount <= baseSalary )
        {
            commission = salesAmount * 0.06;
        }
        else if ( salesAmount <= 10000 )
        {
            commission = (salesAmount - baseSalary) * 0.08 + baseSalary * 0.06;
        }
        else
        {
            commission = (salesAmount - (2 * baseSalary)) * 0.1 + baseSalary * 0.06 + baseSalary * 0.08;
        }

        //  sales amount = 11000
        // sales amount = 11000 - 10000 = 6000

        return commission;

    }
}
