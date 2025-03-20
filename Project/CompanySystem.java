package Project;

// Interface
interface Displayable {
    void displayInfo();  // Interface method (must be implemented in child class)
}

// Abstract class with one abstract method
abstract class Person {
    private String name; // Encapsulation (private attribute)

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and setter method for name (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (to be implemented in child class)
    public abstract void showRole();
}

// Employee class (Inherits from Person and Implements Displayable)
class Employee extends Person implements Displayable {
    private String jobTitle; // Encapsulation (private attribute)

    // Constructor
    public Employee(String name, String jobTitle) {
        // Calls the parent class constructor to initialize 'name' (since it's private in Person)
        super(name);
        this.jobTitle = jobTitle;
    }

    // Getter and Setter for jobTitle (Encapsulation)
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // Overriding abstract method from Person (Method Overriding)
    @Override
    public void showRole() {
        System.out.println(getName() + " works as a " + jobTitle);
    }

    // Implementing interface method from Displayable
    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + getName() + ", Job Title: " + jobTitle);
    }

    // Method Overloading: Same method name with different parameters
    public void displayInfo(String department) {
        System.out.println("Employee Name: " + getName() + ", Job Title: " + jobTitle + ", Department: " + department);
    }
}

// Main class
public class CompanySystem {
    public static void main(String[] args) {
        // Creating an Employee object (Inheritance, Encapsulation)
        Employee emp = new Employee("Alice", "Software Engineer");

        // Calling overridden method from Person
        emp.showRole();

        // Calling interface method from Displayable
        emp.displayInfo();

        // Calling overloaded method
        emp.displayInfo("IT Department");
    }
}
