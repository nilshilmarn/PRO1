package EX02;

public class B112 {

    public static void main(String[] args) {

        double miles = 24;
        double kilometers = miles * 1.6;

        double hours =  1 + (40.0 / 60) + (35.0 / (60 * 60));

        double averageSpeed = kilometers / hours;

        System.out.println(averageSpeed + " km/hour");

    }
}
