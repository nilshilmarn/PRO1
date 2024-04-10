package exarch.storage;

import exarch.model.Company;
import exarch.model.Employee;

import java.util.ArrayList;

public abstract class Storage
{
    private static final ArrayList<Company> companies = new ArrayList<>();
    private static final ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList<Company> getCompanies()
    {
        return new ArrayList<>(companies);
    }

    public static ArrayList<Employee> getEmployees()
    {
        return new ArrayList<>(employees);
    }

    public static void storeCompany(Company company)
    {
        companies.add(company);
    }

    public static void storeEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public static void deleteCompany(Company company)
    {
        companies.remove(company);
    }

    public static void deleteEmployee(Employee employee)
    {
        employees.remove(employee);
    }
}
