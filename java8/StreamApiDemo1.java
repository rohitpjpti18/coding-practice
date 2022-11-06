package java8;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class StreamApiDemo1 {
    public static void main(String[] args) {
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

        System.out.println("Original List: "+ myList);

        // Obtain a stream to the array list.
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum value by use of min(),
        // max(), isPresent(), and get().
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if(minVal.isPresent()) System.out.println("Minimum value: " + minVal.get());

        // Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the steam.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if(maxVal.isPresent()) System.out.println("Maximum value: " + maxVal.get());

        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();

        // Display the sorted stream by use of forEach();
        System.out.print("Sorted stream: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values by use of filter().
        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n%2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Display only the odd values that are greater than 5. Notice that
        // two filter operations are pipelined.
        oddVals = myList.stream().filter(n -> (n%2) == 1).filter(n -> n > 5);
        System.out.print("Odd values greater than 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}