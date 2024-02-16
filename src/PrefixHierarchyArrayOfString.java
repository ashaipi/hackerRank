package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixHierarchyArrayOfString {
    public static void main(String[] args) {
        //List<String> names = new ArrayList<>(Arrays.asList("Ashaipi", "Abubaker", "Ashaipia", "Ali","Ashaipiab", "Ashaipiabc","Alia"));
        //List<String> query = new ArrayList<>(Arrays.asList("Ashaipi","Ali"));
        List<String> names = new ArrayList<>(Arrays.asList("steve", "stevens", "danny", "steves","dan", "john","johnny","joe","alex","alexander"));
        List<String> query = new ArrayList<>(Arrays.asList("steve","alex","joe","john","dan"));
        List<String> newNames = new ArrayList<>();
        List<Integer> prefixNumber = new ArrayList<>();

        for (int i = 0; i < query.size(); i++) {
            int prefixN = 0;
            for (int j = 0; j < names.size(); j++) {
                if (query.get(i).length() <= names.get(j).length()) {
                    String compare = names.get(j).substring(0, query.get(i).length());
                    if (query.get(i).equals(compare)) prefixN++;
                }
            }
            prefixNumber.add(prefixN-1);
        }
        System.out.println(prefixNumber);

        List<Integer> appearsAsPrefix = new ArrayList<>();

        System.out.println(names.get(2).substring(0,query.get(0).length()));

        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < query.size(); j++) {
                System.out.println("i= " + i + ",  names: " + newNames);
                System.out.println(query.get(j).length()+" <= "+names.get(i).length());
                if (query.get(j).length() <= names.get(i).length()) {
                    System.out.println("j="+j+"   "+query.get(j));
                    System.out.println("i="+i+"   "+names.get(i).substring(0, query.get(j).length()));
                    String compare = names.get(i).substring(0, query.get(j).length());
                    if (query.get(j).equals(compare)) {
                        newNames.add(compare);
                    }
                }
                System.out.println("-----------------------------------");
            }
        }
        System.out.println(names);
        System.out.println(newNames);
        for (int j = 0; j < newNames.size(); j++) {
            int count=0;
            for (int i = j+1; i < names.size()-1; i++) {
                System.out.println(newNames.get(i));
                System.out.println(newNames.get(j));
                System.out.println(newNames.get(i).equals(newNames.get(j)));
                System.out.println("i="+i+"       j="+j);
                System.out.println("------------------");
                if(newNames.get(i).equals(newNames.get(j))){
                    count++;
                }
            }
            System.out.println(count);
            appearsAsPrefix.add(count);
        }
        System.out.println(appearsAsPrefix);
        for (int k = 0; k < newNames.size(); k++) {
            for (int i = k+1; i < newNames.size(); i++) {
                if (newNames.get(k).equals(newNames.get(i))) {
                    newNames.remove(i);
                    appearsAsPrefix.remove(i);
                    i--;
                }
            }
        }
        System.out.println(newNames);
        System.out.println(appearsAsPrefix);
    }
}
