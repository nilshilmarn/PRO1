package EX3;

public class Test
{

    public static void main(String[] args)
    {
        Car BMW = new Car("REGISTRATION NO.", "2020");
        Car AUDI = new Car("REGISTRATION NO.", "2020");
        Car MERCEDES = new Car("REGISTRATION NO.", "2020");

        BMW.setPricePerDay(500);
        AUDI.setPricePerDay(550);
        MERCEDES.setPricePerDay(900);

        Rental privat = new Rental(1, "01-01-2024", 10);
        Rental erhverv = new Rental(1, "11-01-2024", 31);

        privat.addCar(BMW);

        erhverv.addCar(AUDI);
        erhverv.addCar(MERCEDES);

        System.out.println(privat.getPrice());
        System.out.println(erhverv.getPrice());


    }

}
