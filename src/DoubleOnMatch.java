package hackerrank;

import java.util.*;

public class DoubleOnMatch {

    public static long doubleSize(List<Integer> arr, int b){
        for (int n : arr ) {
            if(n==b){
                System.out.print("array element = "+n+", is matching the number :"+b);
                b+=n;
                System.out.println(", Double it : "+b);
            }
        }
        System.out.println("---------------------");
        return b;
    }

    public static void main(String[] args) {
        //List<Long> arr = new ArrayList<Long>(Arrays.asList(1L,2L,4L,11L,12L,8L));
        List<Integer> arr = new ArrayList<>(Arrays.asList( 2, 8, 4, 6, 5));
        System.out.println("Original arr: "+arr);
        Collections.sort(arr);
        System.out.println("Sorted array: "+arr);

        int n = 2;
        System.out.println("Double on Match: "+n);
        System.out.println("---------------------");

        System.out.println(doubleSize(arr,n));
    }
}
