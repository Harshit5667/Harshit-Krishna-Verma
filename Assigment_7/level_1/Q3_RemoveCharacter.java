import java.util.Scanner;

public class Q3_RemoveCharacter {

    public static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        String result = removeChar(str, ch);
        System.out.println("Modified String: " + result);

        sc.close();
    }
}
