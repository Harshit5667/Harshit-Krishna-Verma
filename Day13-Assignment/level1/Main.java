interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private double rate;
    private String department;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, 0);
        this.rate = rate;
        this.hours = hours;
    }

    public double calculateSalary() {
        return rate * hours;
    }

    public void assignDepartment(String deptName) {
        department = deptName;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Alice", 5000);
        Employee e2 = new PartTimeEmployee(2, "Bob", 100, 20);

        ((Department)e1).assignDepartment("HR");
        ((Department)e2).assignDepartment("IT");

        e1.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        System.out.println("Dept: " + ((Department)e1).getDepartmentDetails());

        e2.displayDetails();
        System.out.println("Salary: " + e2.calculateSalary());
        System.out.println("Dept: " + ((Department)e2).getDepartmentDetails());
    }
}
