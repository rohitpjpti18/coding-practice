package java8;

import java.util.ArrayList;
import java.util.stream.IntStream;

/*
 * Output: 
 * 
 * Original values in myList: 1.1 3.6 9.2 4.7 12.1 5.0 
 * The ceilings of the values in myList: 2 4 10 5 13 5 
 */
public class StreamApiDemo6 {
    public static void main(String[] args) {
        // A List of double values.
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.print("Original values in myList: ");
        myList.stream().forEach(a -> {System.out.print(a + " ");});
        System.out.println();

        // Map the ceiling of the elements in myList to an IntStream.
        IntStream cStrm = myList.stream().mapToInt(a -> (int) Math.ceil(a));

        System.out.print("The ceilings of the values in myList: ");
        cStrm.forEach(a -> { System.out.print(a + " "); });
        System.out.println();
    }
}
