package java8.multithreading;


class NewThread2 extends Thread {
    NewThread2() {
        // Create a new, second thread.
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

/*
 * Child Thread: Thread[Demo Thread,5,main]
 * Main thread: 5
 * Child Thread: 5
 * Child Thread: 4
 * Main thread: 4
 * Child Thread: 3
 * Child Thread: 2
 * Main thread: 3
 * Child Thread: 1
 * Exiting child thread.
 * Main thread: 2
 * Main thread: 1
 * Main thread exiting.
 */
public class M3ExtendThread {
    public static void main(String[] args) {
        NewThread2 nt = new NewThread2(); // create a new thread

        nt.start();

        try{
            for(int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
