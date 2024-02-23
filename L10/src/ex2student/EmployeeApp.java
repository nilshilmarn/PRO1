package ex2student;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee e1 = new Employee("Hans Jensen", true);
        System.out.println("Test: " + e1);
        System.out.println();

        System.out.println("Name: " + e1.name);
        System.out.println("Trainee? " + e1.trainee);
        System.out.println();

        e1.trainee = false;
        e1.printEmployee();
        System.out.println();


        // b) Add to the Employee class a field age of type int. (Remember to change the toString()
        // method.)
        // In the EmployeeApp class: Give the employee an age and print the age using the age
        // field.

        e1.age = 28;
        System.out.println("Age: " + e1.age + "\n");


        // c) Add a new constructor in the Employee class, so that the an employee also gets an
        // age. Test the new constructor in the EmployeeApp class.

        Employee e2 = new Employee("Nils Nordby", 21, true);
        e2.printEmployee();
        System.out.println();

        // d) Add to the Employe class a method birthday() that makes the employee one year older.
        // Test the method in the EmployeeApp class.

        e2.hadBirthday();
        System.out.println("Age: " + e2.age);
        System.out.println();

    }
}
