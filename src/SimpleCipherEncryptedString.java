package hackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**  *****************ASCII CODE***************
* 6         7                   8                   9
* 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 **/
public class SimpleCipherEncryptedString {
    public static void main(String[] args) {
        String msg = "VGXGPU";
        int k = 100;
        char a = 'A';
        String encrypt = "";
        int ascii = ((k)+(int)a)%91;
        System.out.println(ascii);
        if(((k)+(int)a)%91<65) {
            ascii =65+((k)+(int)a)%91;
            System.out.println("ascii= "+ascii);
        }
        System.out.println((char)ascii);
        System.out.println((char)((k+(int)a)%90));

        for (int i = 0; i < msg.length(); i++) {
            char chr = msg.charAt(i);
            int c = ((int)chr-k);
            System.out.println(" "+chr+"   "+c);
            if(c<65) c=(90-(65-c))+1;   // A ASCII 65 - Z ASCII 90
            System.out.println("---------"+(char)c);
        }
        System.out.println();

        for (int i = 0; i < msg.length(); i++) {
            char chr = msg.charAt(i);
            int c = ((int)chr+k);
            if(c>90) c=(65+(c-90))-1;   // A ASCII 65 - Z ASCII 90
            System.out.print((char)c);
        }
        System.out.println();

        List<Character> ch = new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G','H','I','J','K'
                ,'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'));
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int i=0;
        int j=0;
        while (true){
            System.out.print(" "+alpha.charAt(i));
            i++; j++;
            if(i==26) {
                System.out.println(); i=0;
            }
            if(j==k+1) break;
        }

        System.out.println();
        System.out.println("++++++++++++++++++++++");
        msg = "CDEF";
        k=2;
        i=90;
        String newMsg = "";
        for (int m = 0; m < msg.length(); m++) {
            i=(int)msg.charAt(m);
            j=0;
            while (true) {
                j++;
                if (i == 64) i = 90;
                if (j == k + 1) {
                    newMsg+=(char) i;
                    break;
                }
                i--;
            }
        }
        System.out.println();
        System.out.println(newMsg);
    }
}
