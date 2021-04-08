import java.util.Scanner;
public class KmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the km value: ");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        // 1 km =  0.62 mile
        double miles = 0.62 * km;

        //float miles = 0.62f * km;

        System.out.println(km +" km is " + miles);
    }
}
