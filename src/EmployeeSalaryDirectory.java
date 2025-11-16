import java.util.*;

public class EmployeeSalaryDirectory {

    public static void main(String[] args) {

        // Map: Employee Name → Salary
        Map<String, Double> salaryMap = new HashMap<>();

        // 1️⃣ Add employees
        salaryMap.put("Alice", 50000.0);
        salaryMap.put("Bob", 60000.0);
        salaryMap.put("Charlie", 55000.0);
        salaryMap.put("David", 70000.0);
        salaryMap.put("Eve", 45000.0);
        salaryMap.put("Frank", 70000.0); // same as David (to test ties)

        System.out.println("Initial Salaries: " + salaryMap);

        // 2️⃣ Give raises
        giveRaise(salaryMap, "Alice", 10);   // +10%
        giveRaise(salaryMap, "Charlie", 5);  // +5%
        giveRaise(salaryMap, "John", 8);     // not found

        System.out.println("\nAfter Raises: " + salaryMap);

        // 3️⃣ Compute average salary
        double avgSalary = computeAverage(salaryMap);
        System.out.println("\nAverage Salary: " + avgSalary);

        // 4️⃣ Find highest-paid employees
        List<String> highestPaid = highestPaidEmployees(salaryMap);
        System.out.println("\nHighest Paid Employee(s): " + highestPaid);
        System.out.println("Highest Salary: " + salaryMap.get(highestPaid.get(0)));
    }

    // Give a raise by percentage
    public static void giveRaise(Map<String, Double> salaryMap, String name, double percent) {
        if (!salaryMap.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }

        double current = salaryMap.get(name);
        double updated = current + (current * percent / 100);

        salaryMap.put(name, updated);

        System.out.println("Raise given to " + name + ": New Salary = " + updated);
    }

    // Compute average salary
    public static double computeAverage(Map<String, Double> salaryMap) {
        double sum = 0;

        for (double salary : salaryMap.values()) {
            sum += salary;
        }

        return sum / salaryMap.size();
    }

    // Get list of highest-paid employees (handles ties)
    public static List<String> highestPaidEmployees(Map<String, Double> salaryMap) {
        List<String> highest = new ArrayList<>();

        double max = Double.MIN_VALUE;

        // First find max salary
        for (double salary : salaryMap.values()) {
            if (salary > max) {
                max = salary;
            }
        }

        // Add all employees who have max salary
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            if (entry.getValue() == max) {
                highest.add(entry.getKey());
            }
        }

        return highest;
    }
}
