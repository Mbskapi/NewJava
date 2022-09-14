import java.util.Scanner;

public class CountInt {

    public static void main(String[] args) {
//        doop();
//        side();
     //  Brook();
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < 3; i++){
            for (int k = 1; k < 5; k++) {
                System.out.print("*");
                System.out.println("\n###");

            }
        }
    }
    public static void doop() {
//                for(int j = 4; j > 0; j--) {
//                    for (int f = 5; f > 1; f--) {
//                      System.out.print("*");
//                      System.out.print("\n#######");
//                    }
//                }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++){
               System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void side(){
       for (int a = 0; a < 10; a++){
        for (int k = 1; k <= 10 - a; k++) {
            System.out.print(" * ");
        }
        System.out.println();
    }
}
}


//
//        int numbers;
//
//        int number;
//        for (number = 1; number <= 20; number++) {
//            if (number == 5) {
//                break;
//            }
//            System.out.printf("%d", number);
//        }
//        System.out.printf("%nBreak out of loop at the count = %d%n", number);
//    }

