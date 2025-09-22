import java.util.Scanner;

public class Q6_SubstringOccurrences {

    public static int countSubstring(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int result = countSubstring(str, sub);
        System.out.println("The substring occurs " + result + " times.");

        sc.close();
    }
}
