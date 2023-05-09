import java.util.*;
import java.util.stream.Stream;

public class SetMethod {
    public static void main(String[] args) {
        Set<String> myList = new TreeSet<>();
        myList.add("hello");
        myList.add("world");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        System.out.println(myList);


        for (String set : myList) {
            System.out.println(set);

            Stream<String> stream = myList.stream();

         }
    }
}