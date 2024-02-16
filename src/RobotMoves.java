package hackerrank;

import java.util.Scanner;

/*
 * Create the class Robot. Do not use the public access modifier in your class declaration.
 */

class Robot{
    public int currentX;
    public int currentY;
    public int previousX;
    public int previousY;

    public Robot(){
        this.currentX=0;
        this.currentY=5;
        this.previousX=currentX;
        this.previousY=currentY;
    }
    public Robot(int x, int y){
        this.currentX=x;
        this.currentY=y;
        this.previousX=currentX;
        this.previousY=currentY;
    }
    public void moveX(int dx){
        this.previousX=this.currentX;
        this.currentX=currentX+dx;
    }
    public void moveY(int dy){
        this.previousY=this.currentY;
        this.currentY=currentY+dy;

    }
    public void printCurrentCoordinates(){
        System.out.println(this.currentX+"  "+this.currentY);
    }
    public void printLastCoordinates(){
        System.out.println(this.previousX+" - "+this.previousY);
    }
    public void printLastMove(){
        if(this.currentX!=this.previousX)
            System.out.println("x  "+this.previousX);
        if(this.currentY!=this.previousY)
            System.out.println("y  "+this.previousY);
    }
}
public class RobotMoves {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int dx = 1;
        int dy = 1;

        Robot firstRobot = new Robot();
        firstRobot.printCurrentCoordinates();

        Robot secondRobot = new Robot(x, y);
        secondRobot.printCurrentCoordinates();

        for (int i = 1; i < 3; i++) {
            secondRobot.moveX(dx);
            secondRobot.printLastMove();
            secondRobot.printCurrentCoordinates();
            secondRobot.moveY(dy);
            secondRobot.printLastCoordinates();

            dx += i * i;
            dy -= i * i;
        }
    }
}
