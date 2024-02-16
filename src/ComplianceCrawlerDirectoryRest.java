package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplianceCrawlerDirectoryRest {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("x/","y/","../","z/","./"));
        // "../" -> move to the parent folder of the current folder
        // "./"  -> remain in the same folder
        // "x/"  -> move to the child filder named x

        List<String> newStr = new ArrayList<>();

        for(String e: str){
            System.out.println(e);
            System.out.println(newStr);
            if(e.equals("../")){
                newStr.remove(newStr.size()-1);
            }else if(e.equals("./")){
                // do noting `(: hay!!!
            }else{
                newStr.add(e);
            }
        }
        System.out.println(newStr);
        System.out.println(newStr.size());
    }
}
