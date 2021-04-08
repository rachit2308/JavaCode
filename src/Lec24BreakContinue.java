public class Lec24BreakContinue {
    public static void main(String[] args) {
        // break and continue using loop
                                                                            // break mein condition check nhi hoga jaha break mil jayega toh sab khatam mtlb control seedha bhar
              /*                                                              // continue --> condition pr loop k bhar control chala jayega or dubara next i k liye check hoga
        for(int i = 0; i <5; i++){
            System.out.println("Java is great " + i);
            if(i==2){
                System.out.println("java");
                break;
            }
            */
            for(int j = 0; j <5; j++) {
                if (j == 2) {
                    System.out.println("here j =2");
                    continue;
                }
                System.out.println("Java is great " + j);
            }
        }
    }

