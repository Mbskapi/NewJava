package ChapterSeventeen.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> word.length()==5;
        boolean result = predicate.test("semicolon");
        System.out.println(result);


        List<Person> People = List.of(
                new Person(24,"mark"),
                new Person(12,"billy"),
                new Person(40, "jerry"),
                new Person(95,"kindon"));
            //predicate<Person> pred = (person )->person.getAge()>30;

           People.stream()
                .filter((person) -> person.getAge() ==30)
                .forEach(person -> System.out.println(person));

    }
}
