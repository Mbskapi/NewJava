import java.util.*;

public class MainQueue {

    public static  void main(String[] args) {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("blue");
        colors.add("black");

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("A", 3);

        Set<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(1);

        System.out.println("from set ->" +nums);

        System.out.println("from queue"+ colors);
        System.out.println("from map"+ map);




    }



}
