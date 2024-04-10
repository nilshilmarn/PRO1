package exarch.gui;

import exarch.controller.Controller;
import exarch.model.Company;
import exarch.model.Employee;
import javafx.application.Application;

public class ArchitectureApp
{

    public static void main(String[] args)
    {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage()
    {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);


        Employee Nils = Controller.createEmployee("Nils", 100);
        Employee Martin = Controller.createEmployee("Martin", 101);
        Employee Mikael = Controller.createEmployee("Mikael", 102);
        Employee Sophie = Controller.createEmployee("Sophie", 99);

        Controller.addEmployeeToCompany(ibm, Nils);
        Controller.addEmployeeToCompany(ibm, Martin);
        Controller.addEmployeeToCompany(amd, Sophie);

        
    }
}
