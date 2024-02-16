package hackerrank;

public class StringReduction {

    public static void main(String[] args)
    {
        String s = "bbeadcebfp";
        int count=0, red = 0;

        while(!s.isEmpty()) {
            count=0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(0) == s.charAt(i)) count++;

            if (count > 1) {
                s = s.replace("" + s.charAt(0), "");
                red++;
            }else   s=s.substring(1);

            System.out.println(s + "  red: " + red+"    count: "+count+"  String length: "+s.length());

        }
        if(red==1 && s.length()==0) System.out.println(count);
        else System.out.println(red);

    }
}
