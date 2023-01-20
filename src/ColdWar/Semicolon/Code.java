package ColdWar.Semicolon;

import java.util.ArrayList;
import java.util.List;

public class Code {

   private int result;

    public int getResult() {
        return result;
    }

    public void checkForOddAndEven(int[] arr){
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

            for(int j = 0; j < arr.length; j++){
                if(arr[j] % 2 != 0 && arr.length >= 3){
                    arr1.add(arr[j]);
                }
            }

            for(int k = 0; k < arr.length; k++){
                if(arr[k] % 2 == 0 && arr.length >= 3){
                    arr2.add(arr[k]);
                }
            }

        if(arr1.size() < arr2.size()) result = arr1.get(0);
        else result = arr2.get(0);
    }


    }



