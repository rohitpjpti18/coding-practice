package java8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class StreamApiDemo2 {
    public static void main(String[] args) {
        // Create a list of Integer values.
        ArrayList<Integer> myList = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i<6; i++) {
            myList.add(r.nextInt(100));
        }

        // Two ways to obtain the integer product of the elements
        // in myList by use of reduce().
        Optional<Integer> productObj = myList.stream().reduce((a, b)-> a*b);
        if(productObj.isPresent()) System.out.println("Product as Optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a,b) -> a*b);
        System.out.println("Product as int: " + product);
    }
}
