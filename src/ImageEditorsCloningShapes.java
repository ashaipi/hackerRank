package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Image Editors: Cloning Shapes
 *
 * Most image editors can retain the properties of a drawn shape, which makes the copy-paste operations easier. In, this challenge, implement the Shape class per the following constructor and methods:
 *
 * . The constructor Shape(String type, String color).
 * . The method String getType() to return the shape type.
 * . The method void setType(String type) to update the shape type.
 * . The method String getColor() to return the shape color.
 * . The method void setColor(String color) to update the shape color.
 * . The method Shape cloneShape() to return the clone of the shape.
 *
 * The locked stub code in the editor validates the correctness of the Shape class implementation by performing the following operations on the shapes initially drawn on the image editor:
 *
 * . CS shapeld: This operation creates the clone of the shape.
 * . UT shapeld shapeNewType: This operation updates the shape type.
 * . UC shapeld shapeNewColor. This operation updates the shape color.
 *
 * After performing all the operations, the locked stub code prints the type and color of each shape.
 *
 * Constraints
 *
 * . 1 ≤ numberOfShapes ≤ 50
 * . 1 ≤ numberOfOperations ≤ 500
 */

class Shape{
    String type, color;
    public Shape(String type, String color){
        this.type=type;
        this.color=color;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public Shape cloneShape(){
        Shape sh = new Shape(type, color);
        return sh;
    }
}


public class ImageEditorsCloningShapes {
    //private static final Scanner INPUT_READER = new Scanner(System.in);
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        int numberOfShapes = 3;
        //while (numberOfShapes-- > 0) {
        shapes.add(new Shape("Circle", "Red"));
        shapes.add(new Shape("Square", "Blue"));
        shapes.add(new Shape("Circle", "Yellow"));
        //}

        int numberOfOperations = 6;
        List<String> str = new ArrayList<>(Arrays.asList("CS 1","UT 1 Square","UC 1 Yellow","CS 4",
                "CS 5","UC 3 Green"));
        int i=0;
        while (numberOfOperations-- > 0) {
                String[] operation = str.get(i++).split(" ");
                Shape shape = shapes.get(Integer.parseInt(operation[1]) - 1);

                if (operation[0].equals("CS")) {
                    Shape clonedShape = shape.cloneShape();

                    if (clonedShape == shape) {
                        shapes.add(new Shape("Bad-type", "No-color"));
                    }

                    shapes.add(clonedShape);
                } else if (operation[0].equals("UT")) {
                    shape.setType(operation[2]);
                } else if (operation[0].equals("UC")) {
                    shape.setColor(operation[2]);
                }
            }

            shapes.forEach((shape) -> {
                System.out.println(shape.getType() + " " + shape.getColor());
            });
    }
}
