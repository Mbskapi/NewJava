package EasyCode.com;

import ChapterSeventeen.functionalInterface.Person;

import java.util.LinkedList;
import java.util.ListIterator;

public class ConnectLinkList {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person(34, "james"));
        linkedList.add(new Person(8, "philip"));
        linkedList.add(new Person(57, "moses"));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
                while (personListIterator.hasPrevious()){
                    System.out.println(personListIterator.previous());
                }

    }
}
