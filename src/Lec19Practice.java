import java.util.Scanner;

public class Lec19Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
//Ques2
        System.out.println("enter the marks1 : ");
        int marks1 = sc.nextInt();
        System.out.println("enter the marks2 : ");
        int marks2 = sc.nextInt();
        System.out.println("enter the marks3 : ");
        int marks3 = sc.nextInt();

        float total = (marks1 + marks2 + marks3)/3.0f;

        if(total>40 && marks1 > 33 && marks2 > 33 && marks3 > 33) {
            System.out.println("Student is pass ");
        }
        else{
                System.out.println("Student is fail ");
            }

//Ques3
        System.out.println("Enter the amount: ");
        float amount = sc.nextFloat();
        if(amount<2.5){
            System.out.println("You do not have to pay tax");
        }
        else if( amount > 2.5 && amount < 5.0){
            System.out.println("You have to pay tax of 5%");
        }
        else if( amount > 5.0 && amount < 10.0){
            System.out.println("You have to pay tax of 20%");
        }
        else if ( amount > 10.0 ){
            System.out.println("You have to pay 30%");
        }

//Ques4
        System.out.println("enter the value: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            }

//Ques5
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if(year % 4 ==0 || year % 100 ==0){
            System.out.println("year is leap");
        }
        else{
            System.out.println("year is not leap");
        }
*/
//Ques6
        System.out.println("Enter the website : ");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("organisational");
        }
        else if(website.endsWith(".com")){
            System.out.println("commercial");
        }


    }
}
