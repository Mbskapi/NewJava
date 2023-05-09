package EasyCode.com;

import ChapterSeventeen.functionalInterface.Person;

import java.util.ArrayList;
import java.util.List;

public class Mapping {
    public static void main(String[] args) {
        List<Person> listsmap = new ArrayList<>();
        listsmap.add(new Person(23, "mathew"));
        listsmap.add(new Person(45, "john"));
        listsmap.add(new Person(59, "phiMon"));
        listsmap.size();
        System.out.println(listsmap);
        System.out.println(listsmap.size());

        for(int i = 0; i < 4; i++){
            for (int j = 1; j > i + 1; j++ );
            System.out.println(listsmap.add(new Person(34,"mathew")));

            }
        }

    }

