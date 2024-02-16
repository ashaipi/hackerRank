package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BalancedArrayPivotIndex {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,7,3,6,5,6));
        int pivotIdx =0;

        for (int idx = 0; idx < arr.size(); idx++){
            int sumL = 0;
            int sumR = 0;

            for (int j = 0; j < idx; j++) {
                System.out.printf("L %3d    %3d\n",sumL,arr.get(j));
                sumL+=arr.get(j);
            }
            System.out.println("--------------------");
            System.out.println("SUM left is: "+sumL);
            System.out.println("++++++++++++++++++++");
            for (int k = idx+1; k < arr.size() ; k++) {
                System.out.printf("R %3d    %3d\n",sumR,arr.get(k));
                sumR+=arr.get(k);
            }
            System.out.println("--------------------");
            System.out.println("SUM right is: "+sumR);
            System.out.println("++++++++++++++++++++");
            if(sumL==sumR) {
                pivotIdx = idx;
                break;
            }
        }
        System.out.println("The pivot index is: "+pivotIdx);

    }
}
