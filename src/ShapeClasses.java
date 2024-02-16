package hackerrank;


/**
 * 23. Shape Classes
 *
 * In this challenge you will write three shape classes that return a calculated area for each shape.
 *
 * Implement the following classes and methods:
 *
 * . A Circle class with:
 * o A constructor having one floating-point number parameter, radius.
 * o A getArea() method that returns a ceiling-rounded integer denoting the area of the Circle object, calculated using the formula: area(Circle(radius)) = ceiling(3.14159265 x radius x radius).
 *
 * . A Rectangle class with:
 * o A constructor having two floating-point number parameters: width and height.
 * o A getArea() method that returns a ceiling-rounded integer denoting the area of the Rectangle object, calculated using the formula: area(Rectangle(width, height)) = ceiling(width x height).
 *
 * . A Square class with:
 * o A constructor having one floating-point number parameter, width.
 * o A getArea() method that returns a ceiling-rounded integer denoting the area of the Square object, calculated using the formula: area(Square(width)) = ceiling(width x width).
 *
 * Constraints:
 * . 0 < radius, width, height ≤ 34
 */

class Circle{
    final double PI = 3.14159265;
    float radius;
    public Circle(float radius){
        this.radius=radius;
    }

    public int getArea(){
        return (int)Math.ceil(PI*(this.radius*this.radius));
    }
}

class Rectangle{
    float width, height;
    public Rectangle(float width, float height){
        this.width=width;
        this.height=height;
    }

    public int getArea(){
        return (int)Math.ceil(width*height);
    }
}

class Square{
    float width;
    public Square(float width){
        this.width=width;
    }
    public int getArea(){
        return (int)Math.ceil(width*width);
    }
}

public class ShapeClasses {
    public static void main(String[] args) {
        float radius = 5.0F;
        Circle c1 = new Circle(radius);
        System.out.println(c1.getArea());

        float width = 3.0F;
        float height = 4.0F;
        Rectangle r1 = new Rectangle(width, height);
        System.out.println(r1.getArea());


        radius = 2.0F;
        Circle c2 = new Circle(radius);
        System.out.println(c2.getArea());

        width = 3.3F;
        Square s1 = new Square(width);
        System.out.println(s1.getArea());

        width = 5.0F;
        height = 7.5F;
        Rectangle r2 = new Rectangle(width, height);
        System.out.println(r2.getArea());

        /*
        TODO: Explanation 0
            Area of Circle(5) is 3.14159265 x 5.0 x 5.0 = 78.53981625 = 79
            Area of Rectangle(3, 4) is 3.0 x 4.0 = 12.0 = 12
            Area of Circle(2) is 3.14159265 x 2.0 x 2.0 = 12.5663706 = 13
            Area of Square(3.3) is 3.3 x 3.3 = 10.89 = 11
            Area of Rectangle(5, 7.5) is 5.0 x 7.5 = 37.5 = 38
         */
    }
}
