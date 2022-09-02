import java.security.SecureRandom;

public class Evolution {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();

        for (int i = 1; i <= 20; i++) {
            int face = 1 + SecureRandom.nextInt(6);

            System.out.printf("%d  ", face);
        }
            if(counter % 5 == 0) {
                System.out.println();
            }
        }
    }
