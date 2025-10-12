import java.io.*;

// Class marked Serializable
class Employee implements Serializable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}

public class BackupDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Akhil", 101);

        // Serialize object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee e = (Employee) ois.readObject();
            System.out.println("Deserialized: " + e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
