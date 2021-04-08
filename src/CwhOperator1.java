public class CwhOperator1 {
    public static void main(String[] args) {
        // PRECEDENCE AND ASSOCIATIVITY
        /*
        // In a both *,/ precedence are same so they are evaluated from left to right
        int a = 6*5-34/2;
        System.out.println(a);

        // In b both /,* precedence is same so they r evaluated from left to right
        int b = 60/5-34*2;
        System.out.println(b);
        */
        // Quick quiz
        // Ques1
        int a = 5;
        int b = 1;
        int k = (a-b)/2;
       // System.out.println(k);

        // Ques2
        int c = 4;
        int k1 = b*b - 4*a*c / (2*a);
        System.out.println(k1);

        // Ques3
        int k2 = a*a - b*b;
        System.out.println(k2);

        // Ques4
        int k3 = a*b-c;
        System.out.println(k3);

    }
}
