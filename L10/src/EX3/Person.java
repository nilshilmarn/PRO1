package EX3;

public class Person
{

    String name;
    String address;
    int monthlySalary;

    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }


    public void yearlySalary()
    {
        double totalSalary = monthlySalary * 12.0;
        double bonus = totalSalary * 0.025;
        double yearlySalary = totalSalary + bonus;

        System.out.println("Yearly salary: " + yearlySalary);
    }

    public void printPerson()
    {
        System.out.println("*******************");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Monthly salary: " + monthlySalary);
        System.out.println("*******************");
    }

    @Override
    public String toString()
    {
        return String.format("Person(%s, %s, %s)", name, address, monthlySalary);
    }

}
