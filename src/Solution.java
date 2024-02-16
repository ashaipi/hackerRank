package hackerrank;

class Test{
    public static int a;
    public static int b;
    public Test(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString() {
        return "Test{"+(a+b)+"}";
    }
}


public class Solution {
    public static void main(String args[] ) throws Exception {

        Test t = new Test(11,23);
        System.out.println(t);
    }
}