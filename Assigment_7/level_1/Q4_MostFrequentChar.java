import java.util.Scanner;

public class Q4_MostFrequentChar {

    public static char mostFrequentChar(String str) {
        int[] freq = new int[256]; 
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = mostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close();
    }
}
