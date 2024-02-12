package EX3;

public class B539
{
    public static void main(String[] args)
    {

        int salesAmount = 1000;
        int baseSalary = 5000;
        double commission = 0;
        double totalSalary = 0;

        System.out.println("Sales Amount \t Total Salary");

        do {

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

            totalSalary = salesAmount + commission;

            System.out.printf("%5d \t\t\t %8.2f\n", salesAmount, totalSalary);

            salesAmount += 1000;

        } while(salesAmount <= 10000);



    }


}
