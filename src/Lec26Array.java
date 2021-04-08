public class Lec26Array{
    public static void main(String[] args) {
        /* class of 500 students --> you have to store marks of 500 students
        You have 2 options
        1. Create 500 variable
        2. Use Array
         */
       // int[] marks;            --> array ban gya
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        // marks[5] -->error out of bound exception
         System.out.println(marks[5]);

    }
}


/*

1. int[] marks = new int[];
2. int[] marks=;
   marks = new int[];
3. int[] marks = {25,62,96.69,50};

 */