public class Main implements Runnable {

    public void run() {
        System.out.println("This is inside a thread!");
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new Main());
        myThread.start();
    }
}