package EX01;

public class E19 {
    public static void main(String[] args) {
        double initBalance = 1000;
        double interest = 0.05;

        double firstYear = initBalance + initBalance * interest;

        double secondYear = firstYear + firstYear * interest;

        double thirdYear = secondYear + secondYear * interest;

        System.out.println(firstYear);
        System.out.println(secondYear);
        System.out.println(thirdYear);
    }
}
