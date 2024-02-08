package EX02;

public class B111 {
    public static void main(String[] args) {

        double currentPopulation = 312_032_486;

        double secondInAYear = 365 * 24 * 60 * 60;

        double yearlyIncrease =  secondInAYear / 7.0 - secondInAYear / 13.0 + secondInAYear / 45.0;

        double yearOne = currentPopulation + yearlyIncrease;

        double yearTwo = yearOne + yearlyIncrease;

        double yearThree = yearTwo + yearlyIncrease;

        double yearFour = yearThree + yearlyIncrease;

        double yearFive = yearFour + yearlyIncrease;

        System.out.println("Year 0 " + currentPopulation);

        System.out.println("Year 1 " + yearOne);

        System.out.println("Year 2 " + yearTwo);

        System.out.println("Year 3 " + yearThree);

        System.out.println("Year 4 " + yearFour);

        System.out.println("Year 5 " + yearFive);

    }
}
