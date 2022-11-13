package java8.lambda;

// A block lambda that computes the factorial of an int value.
/*
 * 2 is a factor of 10
 * 3 is not a factor of 10 
 */


interface NumericFunc {
    int func(int n);
}

public class Lambda4Block1Demo {
    public static void main(String args[]) {
        // This block lambda computes the factorial of an int value.
        NumericFunc factorial = (n) -> {
            int result = 1;

            for(int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }    
}
