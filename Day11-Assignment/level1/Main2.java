import java.util.*;

class Employee {
    String name;
    String role;
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }
    void showEmployee() {
        System.out.println("Employee: " + name + " Role: " + role);
    }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();
    Department(String deptName) {
        this.deptName = deptName;
    }
    void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }
    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    List<Department> departments = new ArrayList<>();
    Company(String companyName) {
        this.companyName = companyName;
    }
    void addDepartment(Department dept) {
        departments.add(dept);
    }
    void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");
        d1.addEmployee("Alice", "Developer");
        d1.addEmployee("Bob", "Tester");
        d2.addEmployee("Carol", "Recruiter");
        c.addDepartment(d1);
        c.addDepartment(d2);
        c.showCompany();
        c = null;
        System.gc();
        System.out.println("Company deleted, departments and employees removed");
    }
}
