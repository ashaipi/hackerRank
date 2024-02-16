package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumDifferenceSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,3,2,4));
        System.out.println("Before sort:  "+arr);
        Collections.sort(arr);
        System.out.println("Sorted array: "+arr);
        System.out.println("---------------------------------");

        int sum=0;

        for (int i = 0; i < arr.size()-1; i++) {
            System.out.print(" arr["+i+"]= "+arr.get(i)+" arr["+(i+1)+"]= "+arr.get(i+1));
            System.out.println(" ---> "+(arr.get(i)-arr.get(i+1))+" The absolute value is: "+Math.abs(arr.get(i)-arr.get(i+1)));
            sum+=Math.abs(arr.get(i)-arr.get(i+1));
        }

        System.out.println("---------------------------------");
        System.out.println(sum);
    }
}
