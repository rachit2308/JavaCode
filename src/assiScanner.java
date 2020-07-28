/*
An Application to demonstrate use of Scanner class.
Create an application to accept firstname, rollNumber, percentage,
section, year, course from user. And display the output in the below format.
Output
First Name : Vaibhav
rollNUmber : 81
Percentage : 66.31
Section : G
Year : 2
Course : B.Tech CSE


 */
import java.util.Scanner;
public class assiScanner {
    public static void main(String[]args){
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your first name :");
        String name = object.nextLine();
        System.out.println("Enter roll number :");
        byte roll = object.nextByte();
        System.out.println("Enter the percentage :");
        double per = object.nextDouble();
        System.out.println("Enter the section :");
        byte sec = object.nextByte();    //Enter the sec in numbers
        System.out.println("Enter the year :");
        byte year = object.nextByte();
        object.nextLine();
        System.out.println("Enter the Course :");
        String name1 = object.nextLine();
        //output
        System.out.println("First Name :"+name);
        System.out.println("Roll Number :"+roll);
        System.out.println("Percentage :"+per);
        System.out.println("Section :"+sec);
        System.out.println("Year :"+year);
        System.out.println("Course :"+name1);


    }
}
