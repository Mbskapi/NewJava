package EasyCode.com;

import ChapterSeventeen.functionalInterface.Person;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQuene {
    public static void main(String[] args) {
        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person(23, "alex"));
        superMarket.add(new Person(19, "mary"));
        superMarket.add(new Person(54, "Afam"));
        System.out.println(superMarket.size());
        System.out.println(superMarket.peek());
        System.out.println(superMarket.poll());
        System.out.println(superMarket.size());
    }

    static record person(String name, int age){

}
}
