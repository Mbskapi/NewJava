import java.security.SecureRandom;

public class Evolution {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int counter = 0;
        for (int i = 1; i <= 50; i++) {
            int face = 1 + randomNumber.nextInt(50);
            System.out.printf("%5d", face);
            counter++;
            if(counter % 10 == 0) {
                System.out.println();
            }
        }
    }
}
