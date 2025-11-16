import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        // Simulated votes (10 votes for 3 candidates)
        String[] voteInputs = {
                "Alice", "Bob", "Alice", "Charlie", "Bob",
                "Alice", "Charlie", "Charlie", "Alice", "Bob"
        };

        for (String candidate : voteInputs) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
    }
}
