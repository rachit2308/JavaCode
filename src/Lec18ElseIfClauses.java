import java.util.Scanner;

public class Lec18ElseIfClauses {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");            // char var ='r';   String var = "rachit";
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age){
            case 18:                                       // case'c'            case "dhoni"
                System.out.println("you are adult");
                break;
            case 36:                                       // case'r'            case"rachit"
                System.out.println("you are having job");
                break;
            case 60:                                       // case'e'            case"rohit"
                System.out.println("you are retired");
                break;
            default:
                System.out.println("having a good life");
        }

/*

        if(age>56){
            System.out.println("you are experienced");
        }
        else if (age>46){
            System.out.println("you are semi experienced");
        }
        else if(age>36){
            System.out.println("you are semi-semi experienced");
        }
        else{
            System.out.println("you are a kid :-)");
        }
*/
    }

}
