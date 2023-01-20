package ChapterSeventeen.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
       // Supplier<String> supplier = ()->"unicorns";
        Integer[] numbers ={2,3,4,5,6, 7,13,32,10,1001,60130,2000,3007};
       printArrayElement(numbers);
        List<Integer> numberList = Arrays.asList(numbers);
        numberList.stream()
        .filter((number)-> number%2 == 0).forEach((num)-> System.out.print(num+" "));

    }
   private static void printArrayElement(Integer[] numbers){
        for(int i = 0; i <numbers.length;i++){
            if(numbers[i]%2 == 0) System.out.println(numbers[i]+"");
        }
    }


}
