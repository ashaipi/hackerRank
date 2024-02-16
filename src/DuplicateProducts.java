package hackerrank;

import java.util.*;

public class DuplicateProducts {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("ball", "box","ball", "ball", "box"));
        List<Integer> price = new ArrayList<>(Arrays.asList(2,2,2,2,2));
        List<Integer> weight = new ArrayList<>(Arrays.asList(1,2,1,1,3));
        int count = 0;

        List<String> com = new ArrayList<>();
        for (int i = 0; i < name.size(); i++) {
            com.add(name.get(i)+" "+price.get(i)+" "+weight.get(i));
        }
        System.out.println("List ---> "+com);
        Set<String> set = new HashSet<>(com);
        System.out.println("Set  ---> "+set);
        System.out.println(com.size()-set.size());
//----------------------------------------------------------------
        int count1=0;
        for (int i = 0; i < com.size(); i++) {
            for (int j = i+1; j < com.size(); j++) {
                if(com.get(i).equals(com.get(j))){
                    count1++;
                    com.remove(j);
                    j--;
                }
            }
            System.out.println(com+"  "+count1);
            count1=0;
        }



        for (int i = 0; i < name.size(); i++) {
            System.out.printf(" %10s  %3d    %3d\n",name.get(i),price.get(i),weight.get(i));
        }
        System.out.println("-------------------------------------");
        System.out.println(name);
        for (int i = 0; i < name.size(); i++) {
            for (int j = i+1; j < name.size(); j++) {
                if(name.get(i).equals(name.get(j))&&price.get(i)==price.get(j)&&weight.get(i)==weight.get(j)) {
                    System.out.println(name.get(i)+"   "+count++);
                    name.remove(j);
                    price.remove(j);
                    weight.remove(j);
                    j=j-1;
                    System.out.println("--1--"+name);
                }
            }
            System.out.println("--2--"+name);
        }
        System.out.println(count);

    }
}
