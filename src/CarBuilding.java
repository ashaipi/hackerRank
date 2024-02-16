package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BMW{
    public int no_of_tires = 4;
    public String bodyType = "Plastic";
    public void reverseGear(){
        System.out.println("Reverse Gear is Applied...");
    }
    public void switchOnHeadlights(){
        System.out.println("Headlights turned on...");
    }

    public String modelName = "X3";
    public void topSpeed(){
        System.out.println("TopSpeed of BMW is 200 kmph");
    }
}

public class CarBuilding {
    public static void main(String[] args) {
        List<String> carParts = new ArrayList<>(Arrays.asList("reverseGear","switchOnHeadlights","topSpeed"));
        for (int i = 0; i < 3; i++) {
            String name = carParts.get(i);

            BMW b = new BMW();
            if(name.equals("reverseGear")){
                b.reverseGear();
            }
            if(name.equals("switchOnHeadlights")){
                b.switchOnHeadlights();
            }
            if(name.equals("topSpeed")){
                b.topSpeed();
            }
        }
    }
}