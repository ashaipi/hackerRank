package hackerrank;
/**
 * Employee Profile
 *
 * Implement the following classes:
 *
 * 1. abstract class Employee with the following methods:
 * * abstract void setSalary(int salary) method
 * * abstract int getSalary() method
 * * abstract void setGrade(String grade) method (grade of the employee in the organization)
 * * abstract String getGrade() method
 * * void label() method which prints "Employee's data:\n" (Concrete method, implementation is hidden from end user)
 *
 * 2. class Engineer extending class Employee:
 * * private attribute int salary
 * * private attribute String grade
 * * implement the setter and getter methods from the parent class to set and get attributes (salary and grade)
 *
 * 3. class Manager extending class Employee:
 * * private attribute int salary
 * * private attribute String grade
 * * implement the setter and getter methods from the parent class to set and get attributes (salary and grade)
 *
 * Note: The code stub handles input and calls the methods.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class Employee{
    abstract void setSalary(int salary);
    abstract int getSalary();
    abstract void setGrade(String grade);
    abstract String getGrade();
    public void label(){
        System.out.print("Employee's data:\n");
    }
}

class Engineer extends Employee{
    private int salary;
    private String grade;
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getGrade(){
        return this.grade;
    }
}

class Manager extends Employee{
    private int salary;
    private String grade;

    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getGrade(){
        return this.grade;
    }
}

public class EmployeeProfile {
    public static void main(String[] args) {
 //       Scanner sc = new Scanner(System.in);
  //      String sub = sc.nextLine();
        List<String> in = new ArrayList<>(Arrays.asList("ENGINEER B 50000","MANAGER A 70000"));
        int n = in.size();

        for(int i=0;i<n;i++){
            String[] input = in.get(i).split(" ");
            if(input[0].equals("ENGINEER")){
                Engineer e = new Engineer();
                e.setSalary(Integer.parseInt(input[2]));
                e.setGrade(input[1]);
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
            if(input[0].equals("MANAGER")){
                Manager e = new Manager();
                e.setSalary(Integer.parseInt(input[2]));
                e.setGrade(input[1]);
                e.label();
                System.out.println("GRADE : " + e.getGrade());
                System.out.println("SALARY : " + e.getSalary());
            }
        }
    }
}
