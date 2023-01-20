package FunctionalInterface;

import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer =(name, age)->System.out.println(name+" ::"+ age);
        System.out.println("name ----- age");
        biConsumer.accept("rechael", 78);

        Map<String, Integer> mapOfPersons = Map.of(
                "banke",  38,
                "temi",  56,
                "Hadiza", 123
        );
        mapOfPersons.forEach(biConsumer);
        mapOfPersons.forEach((name, age) -> System.out.println(name+ ""+ age));


    }
}
