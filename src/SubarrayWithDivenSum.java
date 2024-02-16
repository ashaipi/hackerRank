package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayWithDivenSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10,2,-2,-20,10));
        List<Integer> newArr = new ArrayList<>();
        System.out.println(arr);
        int k = -10, count=0;
        int sum=0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                System.out.println("j= "+j+", i= "+i+" --> sum= "+sum);
                if (sum == k) {
                    newArr.add(sum);
                        System.out.println("arr[" + i + "]= " + arr.get(i) + ", arr[" + j + "]= " + arr.get(i + 1) + " sum= " + (arr.get(i) + arr.get(i + 1)) + " --> count= " + count++);
                }
            }
            sum=0;
        }
        System.out.println(count);
        System.out.println(newArr);
    }
}
