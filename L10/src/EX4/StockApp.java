package EX4;

public class StockApp
{

    public static void main(String[] args)
    {

        Stock tesla = new Stock("T", "Tesla");
        System.out.println(tesla);

        tesla.setCurrentPrice(1000);
        tesla.setPreviousClosingPrice(100);
        System.out.println(tesla);

        tesla.getChangePercent();

    }



}
