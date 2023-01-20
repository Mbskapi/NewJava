package Array.Package;

import java.util.Arrays;
import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrays = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        boolean isEmpty = true;
        boolean isDuplicate = false;
        int count = 0;
        while (isEmpty==true){
            System.out.println("Enter number");
            int num = input.nextInt();
            boolean isValidNum = num >= 10 && num <= 100;
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] == num) {
                    isDuplicate = true;
                    break;
                }else isDuplicate = false;

            }
            if(isValidNum ==true && isDuplicate== false){
                arrays[count] = num;
                count++;
            }
            for (int i = 0; i < arrays.length; i++) {
                if (arrays[i] == -1) {
                    isEmpty = true;
                    // break;
                } else isEmpty = false;
            }
            System.out.println(Arrays.toString(arrays));
        }
    }
}

