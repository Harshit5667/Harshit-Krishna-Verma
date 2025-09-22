import java.util.*;

class Faculty {
    String name;
    String subject;
    Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    void showFaculty() {
        System.out.println("Faculty: " + name + " Subject: " + subject);
    }
}

class Department {
    String deptName;
    List<Faculty> faculties = new ArrayList<>();
    Department(String deptName) {
        this.deptName = deptName;
    }
    void addFaculty(Faculty f) {
        faculties.add(f);
    }
    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}

class University {
    String uniName;
    List<Department> departments = new ArrayList<>();
    University(String uniName) {
        this.uniName = uniName;
    }
    void addDepartment(Department d) {
        departments.add(d);
    }
    void showUniversity() {
        System.out.println("University: " + uniName);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        University u = new University("Global University");
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");
        Faculty f1 = new Faculty("Alice", "Java");
        Faculty f2 = new Faculty("Bob", "Data Structures");
        Faculty f3 = new Faculty("Carol", "Algebra");
        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d2.addFaculty(f3);
        u.addDepartment(d1);
        u.addDepartment(d2);
        u.showUniversity();
        u = null;
        System.gc();
        System.out.println("University deleted, departments removed but faculties can exist independently");
        f1.showFaculty();
    }
}
