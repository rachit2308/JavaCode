public class CwhOperator2 {
    public static void main(String[] args) {
        // INCREMENT and DECREMENT OPERATOR
        int i = 10;

        int a = i++;
        System.out.println(a);            // a abhi change nhi hua but i change hogya ha a= 10 b = 11
        System.out.println(i);

        int b = ++i;
        System.out.println(b);           // i =11,  so b= 12 and i = 12
        System.out.println(i);


    }
}
