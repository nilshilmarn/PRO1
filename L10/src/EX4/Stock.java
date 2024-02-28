package EX4;

public class Stock
{

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public void getChangePercent()
    {
        double percentage;

        if (previousClosingPrice > currentPrice)
        {
            percentage = (previousClosingPrice - currentPrice) / currentPrice * 100;
            System.out.println(percentage + "%");
        }
        else
        {
            percentage = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
            System.out.println(percentage + "%");
        }
    }

    @Override
    public String toString()
    {
        return String.format("Stock(%s, %s, %s, %s)", symbol, name, previousClosingPrice,currentPrice);
    }

    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }
}
