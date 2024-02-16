package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingClosedPath {
    public static void main(String[] args) {
        /** Some numbers are formed with closed paths.
         * The digits [0,4,6,9] each have [1] closed path.
         * the digit [8] has [2] closed path.
         * None of the others is formed with a closed path. Given a number, determin the total number of closed paths
         * in all of its digits combined.
         *
         *  [ 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9]
         *  [ 1 ,   ,   ,   , 1 ,   , 1 ,   , 2 , 1]
        */

        List<Integer> closedPath = new ArrayList<>(Arrays.asList(1,0,0,0,1,0,1,0,2,1));

        int number = 649578;
        int orgNumber = number;
        System.out.println("The number is: "+number);
        System.out.println("-------------------------------");
        int total =0 ;
        while (number!=0) {
            System.out.println("Digit: "+number%10+", The closed path is: "+closedPath.get(number%10));
            total+=closedPath.get(number%10);
            number/=10;
        }

        System.out.println("-------------------------------");
        String numStr = orgNumber+"";
        int[] numChar = new int[numStr.length()];
        int[] cPath = new int[numChar.length];
        for (int i = 0; i < numChar.length; i++) {
            numChar[i]=Integer.parseInt(""+numStr.charAt(i));
            cPath[i]=closedPath.get(numChar[i]);
        }
        System.out.println(Arrays.toString(numChar));
        System.out.print(Arrays.toString(cPath));

        System.out.println(" Total is: "+total);

    }
}
