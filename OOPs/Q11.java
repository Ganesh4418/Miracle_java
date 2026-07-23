// Main Class
public class EmployeeHierarchy {
    public static void main(String[] args) {

        Employee manager = new Manager("Rahul", "Hyderabad", 90000);
        Employee developer = new Developer("Anjali", "Bangalore", 70000);
        Employee programmer = new Programmer("Kiran", "Chennai", 50000);

        manager.displayDetails();
        manager.generatePerformanceReport();
        manager.manageProject();

        developer.displayDetails();
        developer.generatePerformanceReport();
        developer.manageProject();

        programmer.displayDetails();
        programmer.generatePerformanceReport();
        programmer.manageProject();
    }
}

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.10; // Default 10% bonus
    }

    // Method to generate performance report
    public void generatePerformanceReport() {
        System.out.println(jobTitle + " " + name + " performance report.");
    }

    // Method to manage projects
    public void manageProject() {
        System.out.println(name + " Managing project.");
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("Name      : " + name);
        System.out.println("Address   : " + address);
        System.out.println("Job Title : " + jobTitle);
        System.out.println("Salary    : " + salary);
        System.out.println("Bonus     : " + calculateBonus());
    }
}

class Manager extends Employee {

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public double calculateBonus() {
        return (salary * 0.20); 
    }

    public void generatePerformanceReport() {
        System.out.println(name + " successfully managed the team and achieved targets.");
    }

    public void manageProject() {
        System.out.println(name + " is managing multiple company projects.");
    }
}

class Developer extends Employee {

    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public double calculateBonus() {
        return salary * 0.15;
    }

    public void generatePerformanceReport() {
        System.out.println(name + " developed high-quality software modules.");
    }

    public void manageProject() {
        System.out.println(name + " is working on software development tasks.");
    }
}

class Programmer extends Employee {

    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public double calculateBonus() {
        return salary * 0.12;
    }

    public void generatePerformanceReport() {
        System.out.println(name + " completed coding tasks efficiently.");
    }

    public void manageProject() {
        System.out.println(name + " is writing and debugging program code.");
    }
}

