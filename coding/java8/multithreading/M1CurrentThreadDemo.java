package java8.multithreading;

/*
 * Current thread: Thread[main,5,main]
 * After name change: Thread[my thread,5,main]
 * 5
 * 4
 * 3
 * 2
 * 1
 */
public class M1CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println("Current thread: " + t);

        // change the name of the thread
        t.setName("my thread");
        System.out.println("After name change: " + t);

        try{
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
    }
}