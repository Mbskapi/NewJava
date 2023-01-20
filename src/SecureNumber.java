import java.security.SecureRandom;
import java.util.Random;

public class SecureNumber {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        for(int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(89063);
            System.out.printf("%d  ", face);

            if (counter % 5 == 0) {
                System.out.println();
            }

        }




    }

}
