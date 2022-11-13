package java8.lambda;


// Use a generic functional interface with lambda expressions.
/*
 * Lambda reversed is adbmaL
 * Expression reversed is noisserpxE
 * The factorial of 3 is 0
 * The factorial of 5 is 0
 */

// A generic functional interface.
interface SomeFunc<T> {
    T func(T t);
}

public class Lambda6GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Use a String-based version of someFunc.
        SomeFunc<String> reverse = str -> {
            String result = "";
            int i;

            for(i = str.length()-1; i>=0; i--) 
                result += str.charAt(i);

            return result;
        };

        System.out.println("Lambda reversed is " + 
                            reverse.func("Lambda"));
        System.out.println("Expression reversed is " +
                            reverse.func("Expression"));

        // Now, use an Integer-based version of SomeFunc.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
 
            for(int i = 0; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}
