package EX02;

public class B110 {

    public static void main(String[] args) {

        double kilometers = 15;
        double minutes = 50.5;


        double hours = minutes / 60;
        double miles = kilometers / 1.6;

        double averageSpeed = miles / hours;

        System.out.println(averageSpeed + " miles/hour");


    }

}
