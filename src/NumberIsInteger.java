import java.util.Scanner;
public class NumberIsInteger {
    public static void main(String[] args) {
        System.out.println("Enter the number to check: ");
        Scanner sc = new Scanner(System.in);
        boolean number = sc.hasNextInt();
        System.out.println(" Enter value is " + number);
    }
}
