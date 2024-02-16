package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class SerialMultiplier {
    public int first=1;
    public int second=1;
    public int third=1;
    public int fourth=1;
    public int fifth=1;

    public SerialMultiplier(int first){
        this.first=first;
    }
    public SerialMultiplier(int first, int second){
        this.first=first;
        this.second=second;
    }
    public SerialMultiplier(int first, int second, int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public SerialMultiplier(int first, int second, int third, int fourth){
        this.first=first;
        this.second=second;
        this.third=third;
        this.fourth=fourth;
    }
    public SerialMultiplier(int first, int second, int third, int fourth, int fifth){
        this.first=first;
        this.second=second;
        this.third=third;
        this.fourth=fourth;
        this.fifth=fifth;
    }

    @Override
    public String toString(){
        return ""+(this.first*this.second*this.third*this.fourth*this.fifth);
    }

}

public class SerialMultiplication {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //List<String> in = new ArrayList<>(Arrays.asList("1 2 3"));
        List<String> in = new ArrayList<>(Arrays.asList("8 7 2 7"));
        String[] input = in.get(0).split(" ");;
        int n = input.length;

        int first=1, second=1, third=1, fourth=1, fifth=1;
        first = Integer.parseInt(input[0]);
        if(n > 1) {
            second = Integer.parseInt(input[1]);
            if(n >= 3) {
                third = Integer.parseInt(input[2]);
                if(n >= 4) {
                    fourth = Integer.parseInt(input[3]);
                    if(n == 5) {
                        fifth = Integer.parseInt(input[4]);
                    }
                }
            }
        }

        SerialMultiplier result;

        switch(n) {
            case 1:
                result = new SerialMultiplier(first);
                System.out.println(result);
                break;
            case 2:
                result = new SerialMultiplier(first,second);
                System.out.println(result);
                break;
            case 3:
                result = new SerialMultiplier(first,second,third);
                System.out.println(result);
                break;
            case 4:
                result = new SerialMultiplier(first,second,third,fourth);
                System.out.println(result);
                break;
            case 5:
                result = new SerialMultiplier(first,second,third,fourth,fifth);
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Inputs");
        }
    }
}
