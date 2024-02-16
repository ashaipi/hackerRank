package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of n integer, and a required sum k, find the number of subarrays whose sum is equal to the required sum
 * A subarray is a contiguous segment of an array.
 */
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10,2,-2,-20,10));
        List<Integer> newArr = new ArrayList<>();
        System.out.println(arr);
        int k = -10, count=0;
        int sum=0;
        System.out.println("----------------------------------------------");
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                System.out.println("j= "+j+", i= "+i+" --> sum= "+sum);
                if (sum == k) {
                    newArr.add(sum);
                    System.out.println("----------------------------------------------");
                    System.out.println("Find a total from array that equal to "+k+", added to new array "+newArr);
                    System.out.println("Count = " + count++);
                    System.out.println("----------------------------------------------");
                }
            }
            sum=0;
        }
        System.out.println("Count = "+count);
        System.out.println(newArr);
    }
}
