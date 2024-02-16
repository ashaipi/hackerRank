package hackerrank;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TwosPower {

    final static String regularExpression = "^0*10*$";

    public static void main(String[] args) {


        String[] someString = {"1000","0100","0010","1","0001","0110","100000","1100"};
        String[] result = new String[someString.length];
        Arrays.fill(result, "False");

        for (int i = 0; i < someString.length; i++) {

            if (someString[i].matches(regularExpression)) {
                result[i] = "True";
            }
        }
        for (String res: result) {
            System.out.println(res);
        }


        System.out.println("-------------------------------------");


        String Str = new String("Welcome to Tutorialspoint.com");
        String s = "abb";

        System.out.println(s.matches("[ab]{1}[a-z]{3}"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7953038349"));//true
        System.out.println(Pattern.matches("[7]{1}[0-9]+", "7953013876878949"));//true
        System.out.println("----> "+Pattern.matches("^0*10*$", "0000100"));//true
        System.out.println("----> "+Pattern.matches("^1*01*$", "111101"));//true
        System.out.println("----> "+Pattern.matches("^[1-2]*0[1-2]*$", "21101212"));//true

        System.out.print("Return Value :" );
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Tutorialspoint"));

        System.out.print("Return Value :" );
        System.out.println(Str.matches("Welcome(.*)"));

        // Declaring and initializing a string
        // Input string
        String Str1 = new String("Welcome to geeksforgeeks");

        // Display message for better readability
        System.out.print("Does String contains regex (.*)geeks(.*) ? : ");
        // Testing if regex is present or not
        System.out.println(Str1.matches("(.*)geeks(.*)"));

        // Display message for better readability
        System.out.print("Does String contains regex geeks ? : ");

        // Testing if regex is present or not
        System.out.println(Str1.matches("geeks"));
    }
}
