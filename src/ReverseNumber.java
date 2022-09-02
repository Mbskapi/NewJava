public class ReverseNumber {

    public static void main(String[] args) {
        int number = 21815, reversed = 0;

        System.out.println("original number: " + number);

        while(number != 0){

            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }
        System.out.println("reversed number: " + reversed);
    }
}
