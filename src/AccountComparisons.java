package hackerrank;

import java.util.*;

/**
 * Account Comparisons
 *
 * Given an interface named "OnlineAccount" that models the account of popular online video streaming platforms, perform the operations listed below. The interface "OnlineAccount" consists of the basePrice, regularMoviePrice, and exclusiveMoviePrice.
 *
 * In order to complete this challenge, you need to implement an incomplete class named "Account' which implements the "OnlineAccount' interface as well as the "Comparable<Account>" interface.
 *
 * Class Account has two attributes to keep track of the number of movies watched:
 *
 * 1. Integer noOfRegularMovies
 * 2. Integer noOfExclusiveMovies
 * 3. String ownerName
 *
 * Methods to complete for class Account:
 *
 * 1. Add a parameterized constructor that initializes the attributes ownerName, numberOfRegularMovies, and numberOfExclusiveMovies.
 * 2. Int monthlyCost() => This method returns the monthly cost for the account. [Monthly Cost = base price
 * + noOfRegularMovies*regularMoviePrice
 * + noOfExclusiveMovies*exclusiveMoviePrice]
 * 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.
 * 4. String toString() which returns => "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
 */

interface OnlineAccount {
    int basePrice = 120;
    int regularMoviePrice = 45;
    int exclusiveMoviePrice = 80;
}

class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    // 1) Add a parameterized constructor that initializes the attributes noOfRegularMovies and noOfExclusiveMovies.
    public Account(String ownerName, int noOfRegularMovies, int noOfExclusiveMovies){
        this.ownerName=ownerName;
        this.noOfExclusiveMovies=noOfExclusiveMovies;
        this.noOfRegularMovies=noOfRegularMovies;
    }


    // 2. This method returns the monthly cost for the account.
    public int monthlyCost() {
        return basePrice+(noOfRegularMovies*regularMoviePrice)+(noOfExclusiveMovies*exclusiveMoviePrice);
    }

    // 3. Override the compareTo method of the Comparable interface such that two accounts can be compared based on their monthly cost.

    @Override
    public int compareTo(Account account){
        return this.monthlyCost() - account.monthlyCost();
    }

    // 4. Returns "Owner is [ownerName] and monthly cost is [monthlyCost] USD."
    public String toString() {
        return "Owner is "+ownerName+" and monthly cost is "+monthlyCost()+" USD.";
    }
}

public class AccountComparisons {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //String sub = sc.nextLine();

        int t = 3;

        ArrayList<Account> list = new ArrayList<Account>();
        List<String> in = new ArrayList<>(Arrays.asList("Frank 12 6","David 7 19","Karen 14 4"));

        for(int i=0; i<t; i++) {
            String[] input = in.get(i).split(" ");
            list.add(new Account(input[0],        // Owner name
                    Integer.parseInt(input[1]),   // number of regular movies
                    Integer.parseInt(input[2]))); // number of exclusive movies
        }

        Collections.sort(list);

        System.out.println("Most valuable account details:");
        System.out.println(list.get(list.size() - 1));
    }
}
