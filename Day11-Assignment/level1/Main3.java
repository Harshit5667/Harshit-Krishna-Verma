import java.util.*;

class Course {
    String courseName;
    List<Student> students = new ArrayList<>();
    Course(String courseName) {
        this.courseName = courseName;
    }
    void addStudent(Student s) {
        students.add(s);
    }
    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("Course: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    List<Student> students = new ArrayList<>();
    School(String schoolName) {
        this.schoolName = schoolName;
    }
    void addStudent(Student s) {
        students.add(s);
    }
    void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            s.showCourses();
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);
        school.addStudent(s1);
        school.addStudent(s2);
        school.showStudents();
        c1.showStudents();
        c2.showStudents();
    }
}
