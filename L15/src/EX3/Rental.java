package EX3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Rental
{
    private int number;
    private int days;
    private LocalDate startDate;
    private double price;


    public Rental(int number, int days, double price, LocalDate startDate)
    {
        this.number = number;
        this.days = days;
        this.price = price;
        this.startDate = startDate;

    }

    public double getPricePrDay()
    {
        return price;
    }

    public void setDays(int days)
    {
        this.days = days;
    }

    public int getDays()
    {
        return days;
    }


    public LocalDate getStartDate()
    {
        return startDate;
    }

    public String getEndDate()
    {

        return Period.between(this.startDate, this.startDate.plusDays(this.days)).toString();

    }


}
