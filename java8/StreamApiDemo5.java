package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

// Use map() to create a new stream that contains only
// selected aspects of the original stream.

class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}

/* 
 * Output:
 * Original values in myList: 
 *      Larry 555-5555 Larry@HerbSchildt.com
 *      James 555-4444 James@HerbSchildt.com
 *      Margo 555-3333 Margo@HerbSchildt.com
 * 
 * List of names and phone numbers: 
 *      Larry 555-5555
 *      James 555-4444
 *      Margo 555-3333
 */
public class StreamApiDemo5 {
    public static void main(String[] args) {
        
        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        
        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Margo", "555-3333", "Margo@HerbSchildt.com"));

        System.out.println("Original values in myList: ");
        myList.stream().forEach(a -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        // Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        System.out.println("List of names and phone numbers: ");
        nameAndPhone.forEach(a -> System.out.println(a.name + " " + a.phonenum));
    }
}
