package java8.multithreading;

// Using runnable thread.
// Create a second thread.
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Childe Thread: " + t);
    }

    // This is the entry point for the second thread.
    public void run() {
        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interuptted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class M2ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // create a new thread

        nt.t.start();   // start a thread;
    }
}
