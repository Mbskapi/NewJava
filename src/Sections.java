import java.util.Scanner;

public class Sections {

    public static void main(String[] args) {
        System.out.println( "input number");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if( number == 1){
            System.out.println("0");
        }
    if(number == 0){
        System.out.println("1");
    }
    }
}
