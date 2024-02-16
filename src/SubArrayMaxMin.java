package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given an array, for each of its subarrays of a given length, determine the minimum element in the
 * subarray. Of all these minima, determine the maximum. The first subarray starts at index 0 and
 * successive subarrays start at indices 1, 2, and so on until the last element of the subarray is the last
 * element of the array.
 *
 * Example:
 *    n = 5, the number of elements
 *    arr = [1, 2, 3, 4, 5]
 *    k=2
 *
 * For subarray size k = 2, the subarrays are [1, 2], [2, 3], [3, 4], [4, 5] and the minima are [1, 2, 3, 4]. The
 * maximum of these is 4, the final answer.
 *
 * Function Description:
 *    Complete the function maxMin in the editor below.
 *
 * maxMin has the following parameter(s):
 *    int arr[n]: an array of integers
 *    int k. an integer
 *
 * Returns:
 *    int: an integer indicating the maximum of the minima of the subarrays
 */

public class SubArrayMaxMin {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,5,4,6,8));
        List<Integer> tempArr = new ArrayList<>();
        List<Integer> minimum = new ArrayList<>();
        List<List<Integer>> newArr = new ArrayList<>();

        int k = 3;
        System.out.println(arr);
        System.out.println("Minimum = "+Collections.min(arr));
        System.out.println("Maximum = "+Collections.max(arr));
        System.out.println("Array length = "+arr.size());

        for (int i = 0; i < arr.size()-k+1; i++) {
            for (int m = 0; m < k; m++) tempArr.add(arr.get(i+m));
            minimum.add(Collections.min(tempArr));
            System.out.println(tempArr);
            newArr.add(new ArrayList<>(tempArr));
            tempArr.clear();
        }
        System.out.println(newArr);
        System.out.println(minimum);
        System.out.println(Collections.max(minimum));

    }
}
