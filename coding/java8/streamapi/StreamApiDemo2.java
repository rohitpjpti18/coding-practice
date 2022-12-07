package java8.streamapi;

import java.util.ArrayList;
import java.util.Optional;
//import java.util.Random;

/*
 * Output:
 * Product as Optional: 1292870808
 * Product as int: 1292870808
 */
public class StreamApiDemo2 {
    public static void main(String[] args) {
        // Create a list of Integer values.
        ArrayList<Integer> myList = new ArrayList<>();

        /* 
        Random r = new Random();

        for(int i = 0; i<6; i++) {
            myList.add(r.nextInt(100));
        }
         */

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        // Two ways to obtain the integer product of the elements
        // in myList by use of reduce().
        Optional<Integer> productObj = myList.stream().reduce((a, b)-> a*b);
        if(productObj.isPresent()) System.out.println("Product as Optional: " + productObj.get());

        // Optional<T> reduce(BinaryOperator<T> accumulator)
        // T reduce(T identityVal, BinaryOperator<T> accumulator)
        //
        // The first form returns an object of type Optional, which contains the result. The
        // second form returns an object of type T (which is the element type of the
        // stream). In both forms, accumulator is a function that operates on two values
        // and produces a result. In the second form, identityVal is a value such that an
        // accumulator operation involving identityVal and any element of the stream
        // yields that element, unchanged. For example, if the operation is addition, then
        // the identity value will be 0 because 0 + x is x. For multiplication, the value will
        // be 1, because 1 * x is x.
        int product = myList.stream().reduce(1, (a,b) -> a*b);
        System.out.println("Product as int: " + product);
    }
}


