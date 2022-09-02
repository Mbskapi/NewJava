import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first integer");
        int number1 = input.nextInt();

        System.out.println("enter second integer");
        int number2 =input.nextInt();

//        int sum = number1 + number2;
//        System.out.printf("sum %s%n", sum);
        if(number1 == number2);
        System.out.printf("%d  ==  %d%n", number1, number2);

        if(number1 != number2);
        System.out.printf("%d  !=  %d%n", number1, number2);

        if(number1 < number2);
        System.out.printf("%d < %d%n",number1, number2);

        if(number1 < number2);
        System.out.printf("%n < %d%n", number1, number2);

        if(number1 <= number2);
        System.out.printf("%d <=  %d%n", number1, number2);

        if(number1 >= number2);
        System.out.printf("%d = %d%n", number1, number2);
    }

}
