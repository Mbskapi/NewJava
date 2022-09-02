import java.sql.SQLOutput;
import java.util.Scanner;

public class User1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number 1");
        var user_input  = scanner.nextInt();
        var larger_number  = user_input;
        var lowest_number = user_input;

        int count = 1;

        while (count <5) {

            System.out.printf("Enter number %d:", count + 1);
            user_input = scanner.nextInt();

            if(user_input > larger_number){
                larger_number = user_input;
            }
    if(user_input < lowest_number){
        lowest_number = user_input;
    }
    count = count + 1;
        }
        System.out.printf("the larger number is %d", larger_number);

        System.out.printf("the lowest number is %d", lowest_number);
        }
}