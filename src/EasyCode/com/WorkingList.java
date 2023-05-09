package EasyCode.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("black");
        colors.add("blue");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.size());
//        System.out.println(colors.contains("pink"));
//        System.out.println(colors.contains("black"));
//        System.out.println(colors.add("pink"));

        for (String color: colors){
           // System.out.println(color);
        }
        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }

//        System.out.println(colors.size());
//        System.out.println(colors.contains("yellow"));
//        System.out.println(colors.add("green"));

        }
    }

