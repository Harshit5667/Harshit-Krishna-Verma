import java.util.Scanner;

public class Q6_StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q6_StudentVoteChecker checker = new Q6_StudentVoteChecker();
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (checker.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " can vote.");
            else
                System.out.println("Student " + (i + 1) + " cannot vote.");
        }

        sc.close();
    }
}
