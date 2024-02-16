package hackerrank;

import java.util.Scanner;

public class MinimumAdditionalCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of card types: ");
        int numTypes = scanner.nextInt();

        int[] cardQuantities = new int[numTypes];

        System.out.print("Enter the number of packets you want to create: ");
        int numPackets = scanner.nextInt();

        for (int i = 0; i < numTypes; i++) {
            System.out.print("Enter the quantity of cards for type " + (i + 1) + ": ");
            cardQuantities[i] = scanner.nextInt();
        }

        int[] additionalCards = calculateMinAdditionalCards(cardQuantities, numPackets);
        System.out.println("To create " + numPackets + " matching packets, the additional cards needed are: ");
        for (int i = 0; i < numTypes; i++) {
            System.out.println(additionalCards[i] + " for card type " + (i + 1));
        }
        int totalAdditionalCards = 0;
        for (int additionalCard : additionalCards) {
            totalAdditionalCards += additionalCard;
        }
        System.out.println("Total additional cards needed: " + totalAdditionalCards);
    }

    private static int[] calculateMinAdditionalCards(int[] cardQuantities, int numPackets) {
        int[] additionalCards = new int[cardQuantities.length];

        for (int i = 0; i < cardQuantities.length; i++) {
            int remainder = cardQuantities[i] % numPackets;
            if (remainder != 0) {
                additionalCards[i] = numPackets - remainder;
            }
        }

        return additionalCards;
    }
}
