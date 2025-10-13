public class BackgroundJob {
    public static void main(String[] args) {
        // Runnable job defined using lambda
        Runnable backgroundTask = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Running background job... Step " + i);
                    Thread.sleep(1000); // simulate work
                }
                System.out.println("Background job completed!");
            } catch (InterruptedException e) {
                System.out.println("Job interrupted!");
            }
        };

        // Execute task asynchronously
        Thread thread = new Thread(backgroundTask);
        thread.start();

        System.out.println("Main thread continues working...");
    }
}
