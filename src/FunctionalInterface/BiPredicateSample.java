package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> biPredicate=(number, word)-> word.length()== number;

        boolean result = biPredicate.test(5, "hello");
        System.out.println(result);
    }
}
