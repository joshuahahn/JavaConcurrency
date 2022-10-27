public class Main implements Runnable {

    public void run() {
        System.out.println("This is inside a thread!");
    }

    public static void main(String[] args) throws InterruptedException {
        String[] list = {
            "One",
            "Two",
            "Three",
            "Four"
        };

        for (String word: list) {
            Thread.sleep(4000);
            System.out.println(word);
        }

        /* 
        // Runnable object
        Runnable myRunnable = new Main();
        // Thread object
        Thread myThread = new Thread(myRunnable);

        // Note that the run() method is never called. It is implicitly called
        // when the thread containing the Main runnable is started.
        myThread.start();
        */
    }
}