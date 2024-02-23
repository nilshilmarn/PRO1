package ex2student;

public class Employee {
    // The name of the employee.
    String name;

    int age;
    // Whether the employee is a trainee or not.
    boolean trainee;

    /** Create an employee. */
    public Employee(String name, boolean trainee) {
        this.name = name;
        this.trainee = true;
    }

    public Employee(String name, int age, boolean trainee)
    {
        this.name = name;
        this.age = age;
        this.trainee = true;
    }

    public void hadBirthday()
    {
        age++;
    }


    @Override
    public String toString() {
        return String.format("Employee(%s, %s, %s)", name, age, trainee);
    }

    /** Print a description of the employee. */

    // e) Change the printEmployee() method, so that it prints all information in this way:
    // ********************
    // First name: Hanne
    // Last name: Sommer
    // Trainee: true
    // Age: 32
    // ********************
    // Hint: Use the lastIndexOf() and the subString() methods in the String class.
    // Test the method.
    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("First name: " + name.substring(0,name.lastIndexOf(" ")));
        System.out.println("Last name:" + name.substring(name.lastIndexOf(" ")));
        System.out.println("Trainee: " + trainee);
        System.out.println("Age: " + age);
        System.out.println("*******************");
    }
}
