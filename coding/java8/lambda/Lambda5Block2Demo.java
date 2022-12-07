package java8.lambda;

// A block lambda that reverse the characters in a string.
/*
 * Lambda reversed is adbmaL
 * Expression reversed is noisserpxE
 */

interface StringFunc {
    String func(String n);
}


public class Lambda5Block2Demo {
    public static void main(String[] args) {
        // This block lambda reverses the characters in a string.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length()-1; i>=0; --i) 
                result += str.charAt(i);

            return result;
        };

        System.out.println("Lambda reversed is " + 
                            reverse.func("Lambda"));
        System.out.println("Expression reversed is " + 
                            reverse.func("Expression"));
    }
}
