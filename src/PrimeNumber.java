package hackerrank;

/**
 * Given an integer, if the number is prime, return [1], otherwise return its smallest divisor greater than [1]
 */
public class PrimeNumber {

    static int isPrime(int n)
    {
        // Corner case
        int count=0, savedNum=0;
        boolean prime = true;
        if (n <= 1) return 1;

        // Check from 2 to n-1
        for (int i = 2; i <= n; i++)
            if (n % i == 0) {

                if(prime) { savedNum=i; prime=false;}
                //return i;
                count++;
                System.out.println("Count: "+count+"     number: "+i);
            }

        System.out.println("---------------"+count);
        if(count>1) return savedNum;
        return 1;
    }

    public static void main(String[] args) {
        int n = 5;

        if(isPrime(n)==1) System.out.println("The number: "+n+", Is prime number");
        else System.out.printf("It is not a prome number.\nThe smallest divisor greater than [1] is: %d\n",isPrime(n));
    }
}
