package hackerrank;

import java.util.*;

/**
 * identical distribution. An e-commerce company specializes in cards with sports figures
 * on them. each sport has different categories of cards. For instance, there might be more
 * desirable cards with the most popular sports personalities, others with small pieces of
 * player's jersey attached, and so on. They have a number of each category of card and want
 * to make some number of packets greater than 1 that each contain equal numbers of each
 * type of card. To do this, they will add more cards of each type until each type can be
 * divided equally among some number of packets. Determine the minimum number of additional
 * cards needed to create a number of packets with equal type distribution.
 *
 * EXAMPLE:
 * n=5 , cardType = [4,7,5,11,15], in order to make 2 matching packets, the following number
 * of additional cards of each type must be added: [0,1,1,1,1]. This sums to 4 additional
 * cards. The number of cards are [4,8,6,12,16] and they can be divided evenly among 2 packets.
 * it 3 packets are needed, sum = 6 items. This yields quantities [6,9,6,12,15]. Any number
 * of packets >= 2 can be created, but creating 2 packets requires the minimum number of
 * additional cards
 */


class Result1 {

    /*
     * Complete the 'cardPackets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY cardTypes as parameter.
     */

public static int cardPackets(List<Integer> cardTypes) {
    // Write your code here
    List<Integer> additionalCard1 = new ArrayList<>();
    List<Integer> additionalCard2 = new ArrayList<>();
    for (int i = 0; i < cardTypes.size(); i++) {
        int r = cardTypes.get(i) % 2;
        if (r != 0) additionalCard1.add(2 - r);
        else additionalCard1.add(r);
    }
    System.out.println(additionalCard1);
    int sum1=0;
    for(int e : additionalCard1) sum1+=e;

    for (int i = 0; i < cardTypes.size(); i++) {
        int r = cardTypes.get(i) % 3;
        if (r != 0) additionalCard2.add(3 - r);
        else additionalCard2.add(r);
    }
    System.out.println(additionalCard2);
    int sum2=0;
    for(int e : additionalCard2) sum2+=e;

    System.out.println("sum1 = "+sum1+",  sum2 = "+sum2);
    if(sum1<sum2) return sum1;
    return sum2;

    }

}

public class IdenticalDistribution {
        public static void main(String[] args){
            List<Integer> cardTypes = new ArrayList<>(Arrays.asList(3,8,7,6,4));
            //List<Integer> cardTypes = new ArrayList<>(Arrays.asList(4,8,6,12,16));
            int result = Result1.cardPackets(cardTypes);
            System.out.println(result);
        }
}
