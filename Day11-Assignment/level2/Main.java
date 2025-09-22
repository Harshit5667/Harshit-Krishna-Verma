import java.util.*;

class Subject {
    String subjectName;
    int marks;
    Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
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
        else return "D";
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.addSubject(new Subject("Maths", 90));
        s1.addSubject(new Subject("Science", 85));
        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(s1);
        System.out.println("Student: " + s1.name + " Grade: " + grade);
    }
}
