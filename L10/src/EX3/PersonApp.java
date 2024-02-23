package EX3;

public class PersonApp
{
    public static void main(String[] args)
    {

        Person Nils = new Person("Nils", "Borggade 6K 2. 5");
        System.out.println(Nils);
        System.out.println();

        Nils.name = "Nils Nordby";
        Nils.monthlySalary = 1000;
        System.out.println(Nils);
        System.out.println();

        Nils.printPerson();

        Nils.yearlySalary();




    }


}
