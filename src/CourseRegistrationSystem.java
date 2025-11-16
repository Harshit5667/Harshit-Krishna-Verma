import java.util.*;

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        // Map: Course Code → Student Count
        Map<String, Integer> courses = new HashMap<>();

        // 1️⃣ Add courses with initial registration counts
        courses.put("CS101", 45);
        courses.put("CS102", 10);
        courses.put("CS103", 55);
        courses.put("CS104", 3);
        courses.put("CS105", 60);

        System.out.println("Initial Course Registrations: " + courses);

        // 2️⃣ Simulate add/drop students
        addStudent(courses, "CS101");
        addStudent(courses, "CS104");
        dropStudent(courses, "CS102");
        dropStudent(courses, "CS104");

        System.out.println("\nAfter Add/Drop Operations: " + courses);

        // 3️⃣ Print courses that are near full (>= 50)
        System.out.println("\nCourses Near Full (>= 50 students):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }

        // 4️⃣ Print under-subscribed courses (< 5)
        System.out.println("\nUnder-Subscribed Courses (< 5 students):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
    }

    // Add a student to a course
    public static void addStudent(Map<String, Integer> courses, String course) {
        courses.put(course, courses.getOrDefault(course, 0) + 1);
        System.out.println("Added 1 student to " + course + ". Now: " + courses.get(course));
    }

    // Drop a student from a course (cannot go negative)
    public static void dropStudent(Map<String, Integer> courses, String course) {
        if (!courses.containsKey(course)) {
            System.out.println(course + " not found.");
            return;
        }

        int current = courses.get(course);

        if (current > 0) {
            courses.put(course, current - 1);
            System.out.println("Dropped 1 student from " + course + ". Now: " + courses.get(course));
        } else {
            System.out.println("Cannot drop. " + course + " already has 0 students.");
        }
    }
}
