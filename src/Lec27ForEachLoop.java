public class Lec27ForEachLoop {
    public static void main(String[] args) {
        /*
        float [] marks = {98.1f,87.3f,79.1f,99.7f,80.4f};
        System.out.println(marks[1]);
        System.out.println(marks.length);            // gives array length
        String [] students = {"rachit","rach","rac","rachi","ra0"};
        System.out.println(students[1]);
*/
        int [] marks = {98,45,79,99,80};
      //  System.out.println(marks.length);
/*
      // Displaying array with for loop
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
       }

//QuickQuiz -->Reverse Order

        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
*/
        System.out.println("displaying the array element with for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
