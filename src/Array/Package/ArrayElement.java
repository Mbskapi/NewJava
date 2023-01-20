package Array.Package;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
      final int array_length = 10;
      int[] arrays = new int[array_length];
        for(int i = 0; i < array_length; i++){
            arrays[i]= 2 + 2 * i;
        }
        System.out.printf("%s%sd%n", "index", "value");

        for(int counter =0; counter<array_length;counter++){
            System.out.printf("%s%8d%n", counter, arrays[counter]);
        }





////        # sorting arrays
//        for(int i = 0; i<arrNum.length; i++){
//            for(int j =i+1; j> arrNum.length; j++) {
//                if (arrNum[j] > arrNum[i]) {
//                    int temp = arrNum[i];
//                    arrNum[i] = arrNum[j];
//                    arrNum[j] = temp;
                    //System.out.println(arrNum[i]);

                }
            }

//        }
//        System.out.print(Arrays.toString(arrNum));


        //        int[] arr = {4, 3, 1, 9};
//        int maxNum = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] > maxNum){
////                maxNum= arr[i];
//            }
//
//
//        }
//        System.out.println(maxNum);
    //}


//}
