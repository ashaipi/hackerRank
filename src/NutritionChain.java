package hackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Nutrition Chain:
 *
 * Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:
 *
 * 1. abstract class Food with the following properties:
 *
 * . double proteins
 * . double fats
 * . double carbs
 * . double tastyScore
 * . void getMacroNutrients [Abstract Method]
 *
 * 2. class Egg which extends class Food and has the following properties:
 *
 * . Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
 * . int tastyScore = 7
 * . String type = "non-vegetarian"
 * . void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 *
 * 3. class Bread which extends class Food and has the following properties:
 *
 * . Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
 * . int tastyScore = 8
 * · String type = "vegetarian"
 * . void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 *
 * Note: The code stub handles input.
 */

abstract class Food{
    double proteins;
    double fats;
    double carbs;
    double tastyScore;
    public abstract void getMacroNutrients();
}

class Egg extends Food{
    int tastyScore=7;
    String type="non-vegetarian";

    public Egg(double proteins, double fats, double carbs){
        super.proteins=proteins;
        super.fats=fats;
        super.carbs=carbs;
    }

    public void getMacroNutrients(){
        System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
    }
}

class Bread extends Food{
    int tastyScore = 8;
    String type = "vegetarian";

    public Bread(double proteins, double fats, double carbs){
        super.proteins=proteins;
        super.fats=fats;
        super.carbs=carbs;
    }

    public void getMacroNutrients(){
        System.out.println("A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
    }

}

public class NutritionChain {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        List<String> com = new ArrayList<>(Arrays.asList("getType","getMacros","getTaste"));
        int cnt = 1;
        for (int i = 0; i < cnt; i++) {

            // name = "Bread" or "Egg"
            String name = "Bread";

            if(name.equals("Bread")) {
                Bread breadObj = new Bread(4, 1.1, 13.8);
                for(int j = 0; j < 3; j++) {
                    String command = com.get(j);
                    if(command.equals("getMacros")) {
                        breadObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + breadObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Bread is " + breadObj.type);
                    }
                }
            } else if (name.equals("Egg")) {
                Egg eggObj = new Egg(6.3, 5.3, 0.6);
                for(int j = 0; j < 3; j++) {
                    String command = com.get(j);
                    if(command.equals("getMacros")) {
                        eggObj.getMacroNutrients();
                    } else if(command.equals("getTaste")) {
                        System.out.println("Taste: " + eggObj.tastyScore);
                    } else if(command.equals("getType")) {
                        System.out.println("Egg is " + eggObj.type);
                    }
                }
            }
        }
    }
}
