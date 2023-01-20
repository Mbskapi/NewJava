package FunctionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        BinaryOperator <Integer> binaryOperator = (number, number2) -> (number*number2);
        System.out.println(binaryOperator.apply(10, 5));

//
//        doubleBinaryOperator doubleBinaryOperator =
//                (num1, num2)-> num1+num2;
//        result = doublebinaryOperator.applyAsDouble(59.89, 100.34);
//        System.out.println(result);
//

    }
}
