package EX3;

import java.time.LocalDate;
import java.time.Period;

public class RentalApp
{

    public static void main(String[] args)
    {
        Rental rentalOne = new Rental(1, 1, 1, LocalDate.now().plusMonths(10));
        Rental rentalTwo = new Rental(2, 2, 2, LocalDate.parse("2024-04-01"));

        
        System.out.println(rentalOne.getStartDate());

        // Total price
        System.out.println(rentalOne.getDays() * rentalOne.getPricePrDay());
        System.out.println(rentalTwo.getDays() * rentalTwo.getPricePrDay());

        // End date
        System.out.println(rentalOne.getEndDate());
        System.out.println(rentalTwo.getEndDate());

        //The date before the start date
        System.out.println(rentalOne.getStartDate().minusDays(1));
        System.out.println(rentalTwo.getStartDate().minusDays(1));

        // Print the number of years, months and days between the end day of one rental and the start
        // day of the other rental

        int years = Period.between(rentalOne.getStartDate().plusDays(rentalOne.getDays()), rentalTwo.getStartDate()).getYears();
        int months = Period.between(rentalOne.getStartDate().plusDays(rentalOne.getDays()), rentalTwo.getStartDate()).getMonths();
        int days = Period.between(rentalOne.getStartDate().plusDays(rentalOne.getDays()), rentalTwo.getStartDate()).getDays();

        System.out.println(years + " " + months + " " + days);
        System.out.println(Period.between(rentalOne.getStartDate().plusDays(rentalOne.getDays()), rentalTwo.getStartDate()).getDays());

        // Also print the total number of days between end date of one rental and
        // start date of the other rental.

        int totalDays = Period.between(rentalOne.getStartDate().plusDays(rentalOne.getDays()), rentalTwo.getStartDate()).getDays();
        System.out.println(totalDays);

    }
}
