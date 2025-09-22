import java.util.*;

class Subject {
    String name;
    int marks;
    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    List<Subject> subjects = new ArrayList<>();
    Student(String name) {
        this.name = name;
    }
    void addSubject(Subject s) {
        subjects.add(s);
    }
    List<Subject> getSubjects() {
        return subjects;
    }
}

class GradeCalculator {
    String calculateGrade(Student s) {
        int total = 0;
        for (Subject sub : s.getSubjects()) {
            total += sub.marks;
        }
        double avg = (double) total / s.getSubjects().size();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
}

public class SchoolApp {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(john);

        System.out.println("Student: " + john.name);
        for (Subject s : john.getSubjects()) {
            System.out.println("Subject: " + s.name + " Marks: " + s.marks);
        }
        System.out.println("Final Grade: " + grade);
    }
}
