package Chapter5;

public class Loops {
    public static void main(String[] args) {
        newTotal();
        System.out.println();
        seeTotal();
        System.out.println();
        emmanuelCode();
        System.out.println();
        finaly();
        System.out.println();
        goldLife();
        System.out.println();
        bold();
        goldLive();
        smile();

    }

    public static void newTotal() {
        for (int i = 1; i <= 40; i++) {
            System.out.print(i + ",");
        }

    }

    public static void seeTotal() {
        for (int i = 40; i >= 0; i--) {
            System.out.print(i + ",");
        }
    }

    public static void emmanuelCode() {
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + ",");
        }

    }

    public static void finaly() {
        for (int i = 40; i >= 0; i--) {
            System.out.print(i + ",");
        }

    }

    public static void goldLife() {
        int i = 0;
        while (i < 10) {
            System.out.print(i + ",");
            i++;
        }

    }

    public static void goldLive() {
        int i = 10;
        while (i > 0) {
            System.out.print(i + ",");
            i +=1;
        }

    }

    public static void bold() {
        int i = 0;
        do {
            System.out.print(i + ",");
            i++;
        } while (i < 30);


    }

    public static void bolds() {
        int j = 20;
        do {
            System.out.print(j + ",");
            j++;
        } while (j > 0);

    }

    public static void smile() {
        for (int counter = 2; counter <= 20; counter += 2) {
            int total = counter;
        }

    }
}
