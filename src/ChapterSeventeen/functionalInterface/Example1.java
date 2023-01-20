package ChapterSeventeen.functionalInterface;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

// how to obtain stream in java
public class Example1 {
    public static void main(String[] args) {
        //1. using the empty factor method from the stream
        //interface
        Stream<Integer>numberStream = Stream.empty();// finite stream
        //2. using the stream utility method of class arrays
        Integer[] numbers ={2, 4, 5, 6, 7, 8, 9};
        Stream<Integer> integerStream = Arrays.stream(numbers);// infinite stream

        // using method to generate of class stream
            //  Stream<Integer> nums = stream.(()->5); // infinite stream
        Stream<Integer> nums = Stream.generate(()-> new Random().nextInt());

        nums.limit(5)//intermediate operate known as limit
                .forEach((n)->System.out.println(n));
    }
}
