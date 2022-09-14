import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {
        double amount;
        double  principal = 1000;
        double rate = 0.05;
        System.out.printf("%s %n", "year", "amount on deposit");

        for(int year =1; year <= 10; year++){
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%20.2f%n",year, amount);
        }
        //for(int num = 0; num <= 10; ++num)
        //System.out.print(num + ",");

       // int total = 0;
        //for (int i = 1; i <= 20; i++){
          // total += i;
        //}
        //System.out.print(total);



        // int i = 0;
        // while (i <= 20) {
        //  System.out.print(i + ",");
        //  i+=3;


        //int num = 20;
       // while (num > 0) {
         //   System.out.print(num + ",");
           // num -= 3;

        //int i = 0;
        //do{
            //System.out.print(i+ ",");
          //  i++;

       // } while (i < 10);

        }
//        int number1 = (int)(String.currentTimeMillis()%10);
//        int number2 = (int)(String.currentTimeMillis()/ 7 %10);
//
//        //create a scanner
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(
//                "what is" + number1 + "+" + number2 + "?");
//        int number = input.nextInt();
//
//        System.out.println(
//                "what is" + number1 + "+" + number2 + " = " + answer + "is"+
//                        (number + number2 == answer));
//    }
    }
