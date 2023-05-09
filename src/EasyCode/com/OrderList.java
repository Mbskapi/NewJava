package EasyCode.com;

import java.util.*;
import java.util.stream.Stream;

public class OrderList {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
                set.add("Hello");
                set.add("World");
                set.add("2");
                set.add("8");
                set.add("5");
       Stream<String> stream = set.stream();
       stream.forEach((element) -> {System.out.println(element);});
//        List<String> lists = new ArrayList<>();
//        lists.add("blueberry");
//        System.out.println(lists);
//
//        System.out.println(set.size());
//        System.out.println();
    }
}
