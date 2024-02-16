package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Arrays {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,5,7,7));
        List<Integer> b = new ArrayList<>(Arrays.asList(0,1,2,3));
        List<Integer> c = new ArrayList<>();
        while(!a.isEmpty() && !b.isEmpty()){
                if(a.get(0)<b.get(0)){
                    System.out.println("--- a < b ----------------------");
                    c.add(a.get(0));
                    System.out.println("c= "+c);
                    a.remove(0);
                    System.out.println("a= "+a);
                    System.out.println("b= "+b);
                    //j--;
                }else if (a.get(0)>b.get(0)){
                    System.out.println("--- a > b ----------------------");
                    c.add(b.get(0));
                    System.out.println("c= "+c);
                    b.remove(0);
                    System.out.println("a= "+a);
                    System.out.println("b= "+b);
                }else{
                    System.out.println("--- a = b ----------------------");
                    c.add(a.get(0));
                    a.remove(0);
                    c.add(b.get(0));
                    System.out.println("c= "+c);
                    b.remove(0);
                    System.out.println("a= "+a);
                    System.out.println("b= "+b);
                }
        }
        System.out.println("--- E N D ----------------------");
        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
        }
        for (int i = 0; i < b.size(); i++) {
            c.add(b.get(i));
        }
        System.out.println("A= "+a);
        System.out.println("B= "+b);
        System.out.println("C= "+c);
    }
}
