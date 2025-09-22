import java.util.Scanner;

public class Q1_ReplaceWord {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Updated sentence: " + result);

        sc.close();
    }
}
