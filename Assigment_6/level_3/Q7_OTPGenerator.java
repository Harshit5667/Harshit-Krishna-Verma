import java.util.Arrays;

public class Q7_OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // 6-digit OTP
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }
}
