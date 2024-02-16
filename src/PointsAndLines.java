package hackerrank;

import java.util.*;
import java.text.DecimalFormat;

/**
 * Points and Lines:
 * Given two fully implemented classes, Point and Line, read through the given code to understand their implementations.
 * Implement the class LineList which implements the interface LineListInterface in order to perform some operations on
 * a list of lines.
 *
 * Interface LineListInterface consists of:
 *
 * . Attribute 'Vector<Line> list_of_lines' which stores a list of lines.
 * . Constructor with parameter Vector<Line> to initialize the list_of_lines attribute.
 * . Method: `Line getLineWithMaxLength()' which returns the first longest line from the list of lines.
 * . Method: 'Vector<Line> getLinesStartingFromPoint(Point p)' which returns a list of all the lines starting from the
 * given point p.
 *
 * Note: The code stub reads input and calls methods.
 *
 * Input Format For Custom Testing:
 * The first line contains an integer, n, denoting the number of lines.
 * Next, n lines are the coordinates for each line in the format [x[1] y[1] x[2] y[2]], where (x[1], y[1]) is the
 * starting point and (x[2], y[2]) is the endpoint of the line.
 * The last line is the starting point for comparison. Format: [x y]
 *
 * Sample Input:
 * STDIN		Function
 * 4		    number of lines n = 4
 * 3 8 13 14	(x1, y1, x2, y2) [0] = 3, 8, 13, 14
 * 8 4 3 12	    (x1, y1, x2, y2) [1] = 8, 4, 3, 12
 * -7 -4 17 6	(x1, y1, x2, y2) [2] = -7, -4, 17, 6
 * 7 3 1 2		(x1, y1, x2, y2) [3] = 7, 3, 1, 2
 * 8 4		    starting point (x, y) = 8, 4
 *
 * Sample Output:
 * Longest Line -- > Start: (-7.0, -4.0) End: (17.0, 6.0)
 * Length: 26.00
 * All the Lines starting from point: (8.0, 4.0)
 * Start: (8.0, 4.0) End: (3.0, 12.0)
 *
 * Explanation:
 * 4 is the total number of lines and (8, 4) is the point to find all the lines starting from this point.
 */

class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        double distance = Math.sqrt(Math.pow(p2.getY() - p1.getY(), 2) +
                                    Math.pow(p2.getX() - p1.getX(), 2)
        );
        return distance;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

class Line {
    private Point start = new Point(0, 0);
    private Point end = new Point(0, 0);

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() { return start; }

    public Point getEnd() { return end; }

    public void setStart(Point start) { this.start = start; }

    public void setEnd(Point end) { this.end = end; }

    public double getLineLength() {
        return Point.distance(start, end);
    }

    public String toString() {
        return "Start: " + this.start + " End: " + this.end;
    }
}

interface ListOfLines {
    public Vector<Line> getLinesFromStartingPoint(Point p);
    public Line getLineWithMaxLength();
    public Vector<Line> list_of_lines = null;
}

class LineList implements ListOfLines {
    public Vector<Line> lineList;
    public LineList(Vector<Line> lines){
        this.lineList = lines;
    }

    public Line getLineWithMaxLength(){
        double max=Integer.MIN_VALUE;
        int location = 0;
        for (int i = 0; i < this.lineList.size(); i++) {
            double point = Point.distance(this.lineList.get(i).getStart(), this.lineList.get(i).getEnd());
            if(max<point) {
                max=point;
                location = i;
            }
        }
        return new Line(this.lineList.get(location).getStart(),this.lineList.get(location).getEnd());
    }

    public Vector<Line> getLinesFromStartingPoint(Point p){
        Vector<Line> linesWithStartingPoint = new Vector<>();
        for (int i = 0; i < this.lineList.size(); i++) {
            double x = this.lineList.get(i).getStart().getX();
            double y = this.lineList.get(i).getStart().getY();
            if(p.getX()==x && p.getY()==y) {
                linesWithStartingPoint.add(this.lineList.get(i));
            }
        }
        return linesWithStartingPoint;
    }
}


public class PointsAndLines {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //String[] input;
        int nLines = 4;    // it's denoting the number of lines

        double[][] input = {{3,8,13,14},{8,4,3,12},{-7,-4,17,6},{7,3,1,2}};
        Vector<Line> lines = new Vector<Line>();
        for(int i=0; i<nLines; i++) {
            double x1 = input[i][0];
            double y1 = input[i][1];
            double x2 = input[i][2];
            double y2 = input[i][3];

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point.distance(p1,p2);
            Line line = new Line(p1, p2);
            lines.add(line);
        }

        /* Input to find all the line starting from point p1 */
        double point_x1 = 8;
        double point_y1 = 4;
        Point startingPoint = new Point(point_x1, point_y1);

        //* Finding Longest Line*//*
        LineList myList = new LineList(lines);

        Line maxLine = myList.getLineWithMaxLength();
        System.out.println("Longest Line --> " + maxLine);
        double length = maxLine.getLineLength();
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Length: " + (String)df.format(length));

        //* Finding all the lines starting from point startingPoint *//*
        Vector<Line> starting_lines = myList.getLinesFromStartingPoint(startingPoint);
        System.out.println("All the Lines starting from point: " + startingPoint);
        Iterator value = starting_lines.iterator();
        while(value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
