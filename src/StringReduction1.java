package hackerrank;

import java.util.Arrays;

public class StringReduction1 {
    public static void main(String[] args) {
        String s ="ababc";
        String[] str = new String[30];

        int k=0,l = s.length();
        System.out.println(s.length());
        //for (int k = 0; k < 2; k++) {
            for (int j = 0; j < 7; j++) {
                for (int i = 0; i < l; i++) {

                    if((i+j+1)<=l){
                        System.out.println(s.substring(i, i + j + 1));
                        str[k++]=s.substring(i, i + j + 1);
                    }

                }
            }
        //}
        //str[k]="abab";
        System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            if(str[i]!=null) str[i]=str[i].replaceFirst("a","");
            if(str[i]!=null) str[i]=str[i].replaceFirst("b","");
        }
        System.out.println(Arrays.toString(str));
    }
}
