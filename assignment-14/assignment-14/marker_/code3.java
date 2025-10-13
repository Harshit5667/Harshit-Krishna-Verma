// Marker interface
interface SensitiveData {}

// Class marked sensitive
class UserData implements SensitiveData {
    String username;
    String password;

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return "UserData{username='" + username + "', password='" + password + "'}";
    }
}

public class SensitiveDataDemo {
    public static void main(String[] args) {
        UserData user = new UserData("akhil123", "secretPass");

        // Check if object is sensitive
        if (user instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + user);
        } else {
            System.out.println("No encryption needed: " + user);
        }
    }
}
