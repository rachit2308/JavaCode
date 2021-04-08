import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("the sum is : ");
        System.out.println(sum);
    }
}
