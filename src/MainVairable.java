import java.time.LocalDate;
import java.util.*;

public class MainVairable {
    public static void main(String[] args) {
        List< String> variable = new LinkedList<>();
        variable.add("color");
        variable.add("blue");
        variable.add("black");
        System.out.println(variable);
        System.out.println(variable.size());
        System.out.println(variable.contains("green"));
        System.out.println(variable.get(2));

        Iterator<String> iterator = variable.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(iterator.hasNext());
        }
        for (String next: variable){
            System.out.println(next);

        }



    }
}
