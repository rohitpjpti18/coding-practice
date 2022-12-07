package java8.multithreading;

class NewThread4 implements Runnable {
    String name; // name of thread
    Thread t;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    // This is the entry point for thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }

        System.out.println(name + " exiting.");
    }
}

/*
 * New thread: Thread[One,5,main]
 * New thread: Thread[Two,5,main]
 * New thread: Thread[Three,5,main]
 * One: 5
 * Two: 5
 * Thread One is alive: true
 * Three: 5
 * Thread Two is alive: true
 * Thread Three is alive: true
 * Waiting for threads to finish.
 * Two: 4
 * Three: 4
 * One: 4
 * One: 3
 * Three: 3
 * Two: 3
 * Two: 2
 * Three: 2
 * One: 2
 * Three: 1
 * Two: 1
 * One: 1
 * One exiting.
 * Three exiting.
 * Two exiting.
 * Thread One is alive: false
 * Thread Two is alive: false
 * Thread Three is alive: false
 * Main thread exiting.
 */
public class M5DemoJoin {
    public static void main(String args[]) {
        NewThread4 nt1 = new NewThread4("One");
        NewThread4 nt2 = new NewThread4("Two");
        NewThread4 nt3 = new NewThread4("Three");

        // Start the threads.
        nt1.t.start();
        //nt1.t.start(); // Throws exception
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());

        try{
            System.out.println("Waiting for threads to finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}
