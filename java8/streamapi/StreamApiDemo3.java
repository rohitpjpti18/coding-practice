package java8.streamapi;

import java.util.ArrayList;
//import java.util.Random;

// Demonstrate the use of a combiner with reduce()
public class StreamApiDemo3 {
    public static void main(String[] args) {
        // This is now a list of double values.
        ArrayList<Double> myList = new ArrayList<>();
        /*
        Random r = new Random(); 

        for(int i = 0; i<6; i++) {
            myList.add(r.nextDouble());
        } 
        */

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        // The results will be the same, but the multiplications can occur in different
        // threads.
        double product = myList.parallelStream().reduce(1.0, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // In this version, combiner defines the function that combines two values that have
        // been produced by the accumulator function. Assuming the preceding program,
        // the following statement computes the product of the elements in myList by use
        // of a parallel stream:
        product = myList.parallelStream().reduce(
                                    1.0, 
                                    (a, b) -> a * b,
                                    (a, b) -> a * b
        );
        System.out.println("Product of same accumulator and combiner: " + product);

        double productOfSqrRoots = myList.parallelStream().reduce(
                                    1.0, 
                                    (a, b) -> a * Math.sqrt(b),
                                    (a, b) -> a * b
        );
        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}
