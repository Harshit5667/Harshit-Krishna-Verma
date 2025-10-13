interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        // Rule: at least 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special character
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[!@#$%^&*()].*");

        return length && upper && lower && digit && special;
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pwd1 = "Strong@123";
        String pwd2 = "weakpass";

        System.out.println(pwd1 + " → " + (SecurityUtils.isStrongPassword(pwd1) ? "✅ Strong" : "❌ Weak"));
        System.out.println(pwd2 + " → " + (SecurityUtils.isStrongPassword(pwd2) ? "✅ Strong" : "❌ Weak"));
    }
}
