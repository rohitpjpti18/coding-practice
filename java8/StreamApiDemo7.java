package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Use collect() to create a List and a Set from a stream;
class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(obj.getClass());
        if(obj.getClass() == NamePhoneEmail.class) {
            NamePhoneEmail n = (NamePhoneEmail) obj;
            return (this.name == n.name && this.phonenum == n.phonenum && this.email == n.email); 
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(obj.getClass());
        if(obj.getClass() == NamePhone.class) {
            NamePhone n = (NamePhone) obj;
            return (this.name == n.name && this.phonenum == n.phonenum); 
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

/*
 * Names and phone numbers in a List: 
 * Larry: 555-5555
 * James: 555-4444
 * Margo: 555-3333
 * 
 * Names and phone numbers in a Set:
 * Margo: 555-3333
 * James: 555-4444
 * Larry: 555-5555
 */
public class StreamApiDemo7 {
    public static void main(String[] args) {
        // A list of names, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Margo", "555-3333", "Margo@HerbSchildt.com"));

        // Map just the names and phone numbers to a new stream.
        Stream<NamePhone> nameAndPhone = myList.stream().map( a -> new NamePhone(a.name, a.phonenum));

        // Use collect to create a List of the names and phone numbers.
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers in a List: ");
        for(NamePhone e: npList) 
            System.out.println(e.name + ": " + e.phonenum);
        
        // Obtain another mapping of the names and phone numbers.
        nameAndPhone = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));

        // Now, create a Set by use of collect().
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        
        System.out.println("\nNames and phone numbers in a Set:");
        for(NamePhone e: npSet) System.out.println(e.name + ": " + e.phonenum);
    }
}
