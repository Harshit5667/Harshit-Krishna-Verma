import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        // Map to store student grades
        Map<String, Double> grades = new HashMap<>();

        // 1️⃣ Add several students and their grades
        grades.put("Alice", 85.0);
        grades.put("Bob", 78.5);
        grades.put("Charlie", 92.0);
        grades.put("David", 67.5);

        System.out.println("Initial Grades: " + grades);

        // 2️⃣ Update grade (student re-takes test)
        // Bob improved his score
        grades.put("Bob", 88.0);

        System.out.println("After Update (Bob improved): " + grades);

        // 3️⃣ Remove a student (dropped out)
        grades.remove("David");

        System.out.println("After Removing David: " + grades);

        // 4️⃣ Print list sorted alphabetically by student name
        // Convert to TreeMap for automatic sorting
        Map<String, Double> sortedGrades = new TreeMap<>(grades);

        System.out.println("\nStudents & Grades (Alphabetical Order):");
        for (Map.Entry<String, Double> entry : sortedGrades.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
