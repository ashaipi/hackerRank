package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResultPrefix {

    /*
     * Complete the 'findCompletePrefixes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY names
     *  2. STRING_ARRAY query
     */

    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
        // Write your code here
        List<Integer> prefixNumber = new ArrayList<>();

        for (int i = 0; i < query.size(); i++) {
            int prefixN=0;
            for (int j = 0; j < names.size(); j++) {
                if(query.get(i).length() <= names.get(j).length()){
                    String nameCompare = names.get(j).substring(0,query.get(i).length());
                    if(query.get(i).equals(nameCompare)) prefixN++;
                }
            }
            prefixNumber.add(prefixN-1);
        }

        return prefixNumber;

    }

}

public class PrefixHierarchy {
    public static void main(String[] args) {
        int namesCount = 10;

        List<String> names = new ArrayList<>(Arrays.asList("steve", "stevens", "danny", "steves",
                "dan", "john", "johnny", "joe", "alex", "alexander"));

        int queryCount = 5;

        List<String> query = new ArrayList<>(Arrays.asList("steve", "alex", "joe", "john", "dan"));

        List<Integer> result = ResultPrefix.findCompletePrefixes(names, query);
        System.out.println(result);
    }
}
