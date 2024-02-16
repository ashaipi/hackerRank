package hackerrank;

class ResultFourthBit {

    /*
     * Complete the 'fourthBit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER number as parameter.
     */

    public static int fourthBit(int number) {
        // Write your code here
        int i=1;
        while(number>0){
            if(i==4) return number%2;
            number/=2;
            i++;
        }
        return 0;

    }

}
public class FourthBit {
    public static void main(String[] args) {
        int number = 77;
        int result = ResultFourthBit.fourthBit(number);
        System.out.printf("The fourth bit of the dicemal number %d is [%d]\n",number,result);
    }
}
