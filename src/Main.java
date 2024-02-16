package hackerrank;

public class Main {
    public static char get(char a, char b) {
        if (a == 'a') {
            if (b == 'b') return 'c';
            else return 'b';
        } else if (a == 'b') {
            if (b == 'a') return 'c';
            else return 'a';
        } else {
            if (b == 'b') return 'a';
            else return 'b';
        }
    }
    public static void main(String[] args) {
        String test = "abcabc";
        for (int times = 0; times < test.length(); times++) {
            StringBuffer sb = new StringBuffer();
            sb.append(test.charAt(0));
            for (int i = 1; i < test.length(); i++) {
                if (test.charAt(i) != sb.charAt(sb.length() - 1)) {
                    char rep = get(test.charAt(i), sb.charAt(sb.length() - 1));
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(rep);
                } else {
                    sb.append(test.charAt(i));
                }
            }
            test = sb.toString();
        }
        System.out.println(test);
    }
}
