package hackerrank;

/**
 * 44. Building Implementation
 *
 * The interface Building has the following methods:
 *
 * · void floorCompleted(int floorNumber);
 * · void printStatus(int floorNumber);
 * · void printNumberOfFloors();
 *
 * Create 2 classes, School and Hospital, where these classes implement the interface Building. Class requirements follow.
 *
 * 1. Class School should have a variable of type int[] floors. It should implement the following methods:
 *
 * · School(int n):
 * o Initializes the empty array floors of length n, the number of floors in the school.
 * o Assigns 0 to all elements of floors. This signifies that none of the floors are completed.
 * o Prints the string "A school is being constructed".
 * · void floorCompleted(int floorNumber): floorNumber refers to the floor whose construction has been completed.
 * o Assigns 1 to the floorNumber in the array floors.
 * o If floorNumber <= n, prints the string "Construction for floor number {floorNumber} completed in school".
 * o If floorNumber > n, prints the string "Floor number {floorNumber} does not exist in school".
 * . void printStatus(int floorNumber): Returns the status of the floorNumber.
 * o If floorNumber > n, prints "Floor number {floorNumber} does not exist in school".
 * o If status = 1, prints "Construction for floor number {floorNumber} completed in school".
 * o If status = 0, prints "Construction for floor number {floorNumber} not completed in school".
 * . void printNumberOfFloors(): Prints the total number of floors in the building: "The school has {n} floors".
 *
 * 2. Class Hospital should have a variable of type int[] floors. It should implement the following methods:
 *
 * . Hospital(int n): Initializes the empty array floors of length n, the number of floors in the hospital.
 * o Assigns 0 to all elements of floors. This signifies that none of the floors are completed.
 * o Prints "A hospital is being constructed".
 * · void floorCompleted(int floorNumber): floorNumber refers to the floor whose construction has been completed.
 * o Assigns 1 to the floorNumber in the array floors.
 * o If floorNumber is greater than n, prints "Floor number {floorNumber} does not exist in hospital".
 * o If floorNumber is ≤ than n, prints "Construction for floor number {floorNumber} completed in hospital".
 * . void printStatus(int floorNumber). Returns the status of the floorNumber.
 * o If floorNumber > n, prints "Floor number {floorNumber} does not exist in hospital".
 * o If status = 1, prints "Construction for floor number {floorNumber} completed in hospital".
 * o If status = 0, prints "Construction for floor number {floorNumber} not completed in hospital".
 * . void printNumberOfFloors(): Prints the total number of floors in the building: "The hospital has {n} floors".
 *
 * Note: The locked code stub provides the interface Building and also validates the implementation of the School and Hospital classes.
 */

interface Building{
    void floorCompleted(int floorNumber);
    void printStatus(int floorNumber);
    void printNumberOfFloors();
}

class School implements Building{
    public int[] floors;

    public School(int n){
        this.floors = new int[n];
        for (int i = 0; i < this.floors.length; i++) {
            this.floors[i]=0;
        }
        System.out.println("A school is being constructed");
    }

    public void floorCompleted(int floorNumber){
        if(floorNumber<=this.floors.length){
            this.floors[floorNumber-1]=1;
            System.out.println("Construction for floor number "+floorNumber+" completed in school");
        }else {
            System.out.println("Floor number "+floorNumber+" does not exist in school");
        }

    }

    public void printStatus(int floorNumber){
        if(floorNumber>this.floors.length){
            System.out.println("Floor number "+floorNumber+" does not exist in school");
        }else if(this.floors[floorNumber-1]==1){
            System.out.println("Construction for floor number "+floorNumber+" completed in school");
        }else if(this.floors[floorNumber-1]==0){
            System.out.println("Construction for floor number "+floorNumber+" not completed in school");
        }
    }
    public void printNumberOfFloors(){
        System.out.println("The school has "+this.floors.length+" floors");
    }
}

class Hospital implements Building{
    public int[] floors;

    public Hospital(int n){
        this.floors = new int[n];
        for (int i = 0; i < this.floors.length; i++) {
            this.floors[i]=0;
        }
        System.out.println("A hospital is being constructed");
    }

    public void floorCompleted(int floorNumber){
        if(floorNumber<=this.floors.length){
            this.floors[floorNumber-1]=1;
            System.out.println("Construction for floor number "+floorNumber+" completed in hospital");
        }else {
            System.out.println("Floor number "+floorNumber+" does not exist in hospital");
        }

    }

    public void printStatus(int floorNumber){
        if(floorNumber>this.floors.length){
            System.out.println("Floor number "+floorNumber+" does not exist in hospital");
        }else if(this.floors[floorNumber-1]==1){
            System.out.println("Construction for floor number "+floorNumber+" completed in hospital");
        }else if(this.floors[floorNumber-1]==0){
            System.out.println("Construction for floor number "+floorNumber+" not completed in hospital");
        }
    }
    public void printNumberOfFloors(){
        System.out.println("The hospital has "+this.floors.length+" floors");
    }

}

public class BuildingImplementation {
    public static void main(String[] args) {
        //int[] floors = { 1, 2};
        int[] floors = { 10, 15};
        School s = new School(floors[0]);
        Hospital h = new Hospital(floors[1]);
        s.printNumberOfFloors();
        h.printNumberOfFloors();

        //int[] floorNumbers1 = {1, 5};
        int[] floorNumbers1 = {5, 10, 20};
        for (int i = 0; i < floorNumbers1.length; i++) {
            s.floorCompleted(floorNumbers1[i]);
        }
        //int[] floorNumbers2 = {5,1};
        int[] floorNumbers2 = {3, 6, 7};
        for (int i = 0; i < floorNumbers2.length; i++) {
            s.printStatus(floorNumbers2[i]);
        }

        //int[] floorNumbers3 = {8,3};
        int[] floorNumbers3 = {7};
        for (int i = 0; i < floorNumbers3.length; i++) {
            h.floorCompleted(floorNumbers3[i]);
        }

        //int[] floorNumbers4 = {2,3,6};
        int[] floorNumbers4 = {2, 4, 8, 20};
        for (int i = 0; i < floorNumbers4.length; i++) {
            h.printStatus(floorNumbers4[i]);
        }
    }
}
