package EX4;

import java.time.LocalDate;

public class Account
{
    private int id;
    private double balance;

    private double annualInterestRate;

    private LocalDate dateCreated;

    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();

    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public double getMonthlyInterestRate()
    {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest()
    {

        return balance * getMonthlyInterestRate();

    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate / 100;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
}