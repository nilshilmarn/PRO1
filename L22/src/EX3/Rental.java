package EX3;

import java.util.ArrayList;

public class Rental
{
    private int no;
    private String date;
    private int days;
    private final ArrayList<Car> cars;

    public Rental(int no, String date, int days)
    {
        this.no = no;
        this.date = date;
        this.days = days;
        this.cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars()
    {
        return new ArrayList<>(cars);
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public void removeCar(Car car)
    {
        cars.remove(car);
    }

    public int getPrice()
    {
        int price = 0;

        for (Car c : cars)
        {
            price += this.days * c.getPricePerDay();
        }
        return price;
    }

    public int getNo()
    {
        return no;
    }

    public String getDate()
    {
        return date;
    }

    public void setDays(int days)
    {
        this.days = days;
    }

    public int getDays()
    {
        return days;
    }


}
