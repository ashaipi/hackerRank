package hackerrank;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

class AdditionMagic1{

    public String add(double a, String b){
        System.out.println("double + String");
        return a+b;
    }
    public String add(double a, double b){
        System.out.println("double + double");
        double d = a+b;
        String str= d+"";
        System.out.println("----"+str+"    index of(.) is: "+str.indexOf("."));
        str=str.substring(0,str.indexOf(".")+2);
        return str;
    }
    public String add(String a, String b){
        System.out.println("String + String");
        return a+b;
    }

}

public class AdditionMagic {

    private static final Pattern DOUBLE_PATTERN = Pattern.compile(
            "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
                    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
                    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
                    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");

    public static boolean isFloat(String s)
    {
        return DOUBLE_PATTERN.matcher(s).matches();
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String sub = sc.nextLine();
        List<String> tmp = new ArrayList<>(Arrays.asList("331.377 2","7 h"));
        //List<String> tmp = new ArrayList<>(Arrays.asList("1 hello","hello, world","5 7"));
        int n = tmp.size();
        for(int i=0;i<n;i++) {
            String[] temp = tmp.get(i).split(" ");
            System.out.println(Arrays.toString(temp));
            Boolean  firstDouble = isFloat(temp[0]);
            System.out.print(firstDouble+"         ");
            Boolean  secondDouble = isFloat(temp[1]);
            System.out.println(secondDouble);
            AdditionMagic1 additionMagic = new AdditionMagic1();
            if(firstDouble && secondDouble){
                System.out.println(additionMagic.add(Double.parseDouble(temp[0]), Double.parseDouble(temp[1])));
            }else {
                System.out.println(additionMagic.add(temp[0], temp[1]));
            }
        }
    }
}
