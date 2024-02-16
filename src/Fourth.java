package hackerrank;

/**
 * Find the fourth bit of a decimal number is [0] or [1]
 */
public class Fourth {

    public static int forthBit(int number){
        int index = 1;
        while(number > 0){

            if(index==4) return number%2;

            number /= 2;
            index++;

        }
        return 0;


    }
    public static void main(String[] args) {

        System.out.println(forthBit(77));

    }
}
