package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResultSWGS{
    public static long countNumberOfSubarrays(List<Integer> arr, int k) {
        // Write your code here
        System.out.println(arr);
        List<Integer> newArr = new ArrayList<>();
        int sum=0, r=0;
        long count=0L;

        for (int i = 0; i < arr.size(); i++) {
            sum+=arr.get(i);
            while (count>k){
                count-=arr.get(r);
                r++;
                System.out.println(count+"   "+r);
            }
            if(count==k){
                System.out.println(count+" --- "+k+"   "+r);
                newArr.add(r+1);
                newArr.add(i+1);
                return r;
            }
        }
        newArr.add(-1);
        System.out.println(newArr);
        return r;
    }
}

public class SubarrayWithGivenSum1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(10,2,-2,-20,10));
        int k = -10;
        long result = ResultSWGS.countNumberOfSubarrays(arr,k);
        System.out.println(result);

    }
}
