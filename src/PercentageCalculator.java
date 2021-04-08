import java.util.Scanner;
class max{
    int max = 100;
}
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Subject marks ");
        int a = sc.nextInt();
        System.out.println("Enter 2 Subject marks ");
        int b = sc.nextInt();
        System.out.println("Enter 3 Subject marks ");
        int c = sc.nextInt();
        System.out.println("Enter 4 Subject marks ");
        int d = sc.nextInt();
        System.out.println("Enter 5 Subject marks ");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float percent = sum/5;
        System.out.print("The Percentage is : ");
        System.out.println(percent);


    }
}
