package hackerrank;

class Robot1{
    public int currentX;
    public int currentY;
    public int previousX;
    public int previousY;

    public Robot1(){
        this.currentX=0;
        this.currentY=5;
        this.previousX=currentX;
        this.previousY=currentY;
    }
    public Robot1(int x, int y){
        this.currentX=x;
        this.currentY=y;
        this.previousX=0;
        this.previousY=5;
    }
    public void moveX(int dx){
        this.previousX=this.currentX;
        this.previousY=this.currentY;
        this.currentX=currentX+dx;
        this.currentY=this.previousY;
    }
    public void moveY(int dy){
        this.previousY=this.currentY;
        this.previousX=this.currentX;
        this.currentY=currentY+dy;
        this.currentX=this.previousX;

    }
    public void printCurrentCoordinates(){
        System.out.println(this.currentX+" "+this.currentY);
    }
    public void printLastCoordinates(){
        System.out.println(this.previousX+" "+this.previousY);
    }
    public void printLastMove(){
        if(this.currentX!=this.previousX)
            System.out.println("x "+(this.currentX - this.previousX));
        if(this.currentY!=this.previousY)
            System.out.println("y "+(this.currentY - this.previousY));
    }
}

public class TheRobotClass {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int dx = 4;
        int dy = 6;

        Robot1 firstRobot = new Robot1();
        firstRobot.printCurrentCoordinates();

        Robot1 secondRobot = new Robot1(x, y);
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
