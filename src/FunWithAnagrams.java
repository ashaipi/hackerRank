package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunWithAnagrams {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList("code","doce","ecod","framer","frame"));
        //List<String> text = new ArrayList<>(Arrays.asList("code","aaagmnrs","anagrams","doce"));
        //List<String> text = new ArrayList<>(Arrays.asList("poke","pkoe","okpe","ekop"));
        List<String> tempText = new ArrayList<>();


        for (int i = 0; i < text.size(); i++) {
            char tempArr[] = text.get(i).toCharArray();
            Arrays.sort(tempArr);
            tempText.add(String.valueOf(tempArr));
        }
        System.out.println(text);
        System.out.println(tempText);

        for (int i = 0; i < tempText.size(); i++) {
            for (int j = i+1; j < tempText.size(); j++) {
                if(tempText.get(i).equals(tempText.get(j))) {
                    tempText.remove(j);
                    text.remove(j);
                    j--;
                }
            }
        }

        Collections.sort(text);
        System.out.println(text);
    }
}
