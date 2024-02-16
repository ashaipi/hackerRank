package hackerrank;

import java.util.Scanner;

class ItemSeparator {
    public String rawInput;
    private String name;
    private double price;
    private Integer quantity;

    public ItemSeparator(String rawInput){
        rawInput=rawInput.replace("$$", "");
        String[] str = rawInput.split("##");
        this.name=str[0];
        this.price=Double.parseDouble(str[1]);
        this.quantity=Integer.parseInt(str[2]);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity=quantity;
    }

}

public class FilteringString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String sub = "Bread$$##12.5$$##10";
        ItemSeparator itemData = new ItemSeparator(sub);
        System.out.println("Item Name: " + itemData.getName());
        System.out.println("Item Price: " + itemData.getPrice());
        System.out.println("Item Quantity: " + itemData.getQuantity());
    }
}
