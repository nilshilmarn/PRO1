package exarch.model;

public class Employee
{
    private String name;
    private int wage; // hourly wage

    private Company company; // nullable

    /**
     * Pre: name not empty, wage >= 0.
     */
    public Employee(String name, int wage)
    {
        this.name = name;
        this.wage = wage;
    }

    /**
     * Note: Nullable return value.
     */
    public Company getCompany()
    {
        return company;
    }

    /**
     * Note: Nullable param group.
     */
    public void setCompany(Company company)
    {
        this.company = company;
    }


    public String getName()
    {
        return name;
    }

    /**
     * Pre: name not empty.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    public int getWage()
    {
        return wage;
    }

    /**
     * Pre: wage >= 0.
     */
    public void setWage(int wage)
    {
        this.wage = wage;
    }

    public double getSalary()
    {

        if (company != null)
        {
            return this.wage * company.getHours();
        }
        return 0;

    }

    @Override
    public String toString()
    {
        return name + " (kr " + wage + ")";
    }
}
