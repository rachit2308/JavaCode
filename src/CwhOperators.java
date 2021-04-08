public class CwhOperators {
    public static void main(String[] args) {
        // 1. ARITHMETIC OPERATOR

        int a = 4;            //modulo operator
        int b = 6 % a;

        // 2. ASSIGNMENT OPERATOR

        int c = 4;
        c*=4;
        System.out.println(c);


        // 3. COMPARISION OPERATOR
        //  true & false mein return krta ha

        System.out.println(64>6);
        System.out.println(64<6);
        System.out.println(64==6);


        // 4. LOGICAL OPERATOR
        System.out.println(64>5 && 64>10);    // AND dono true hona chhaiye
        System.out.println(64>5 && 64>70);
        System.out.println(64>5 || 64>68);    // OR dono mein se koi bhi ek true hojaye
        System.out.println(64>70 || 64>70);
        // 5. BITWISE OPERATOR


    }
}
