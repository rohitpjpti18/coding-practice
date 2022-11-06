package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApiDemo4 {
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
        
        // Map the square root of the elements in myList to a new stream.
        Stream<Double> sqrtRootStrm = myList.stream().map(a -> Math.sqrt(a));

        // Find the product of the square roots.
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a,b)-> a*b);

        System.out.println("Product of square roots is " + productOfSqrRoots);
    }
}
