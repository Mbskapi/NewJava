import java.util.Scanner;

public class AccountsTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Accounts myAccount1 = new Accounts("senior boy",3000.0);
        Accounts myAccount2 = new Accounts("smile peter",3500.5);

       System.out.printf(" enter deposit amount for Account1");
       double depositAmount = input.nextDouble();
        System.out.printf("adding %.2f Account1 balance %n%n", depositAmount);
            myAccount1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());


        System.out.printf(" enter deposit amount for Account2");
         depositAmount = input.nextDouble();
        System.out.printf("adding %.2f Account2 balance %n%n", depositAmount);
        myAccount2.deposit(depositAmount);

        System.out.printf(" enter deposit amount for Account2");
         depositAmount = input.nextDouble();
        System.out.printf("adding %.2f Account2 balance %n%n", depositAmount);
        myAccount2.deposit(depositAmount);

        //  System.out.println("enter the name");
       // String theName = input.nextLine();
       // myAccount1.setName(theName);
       // System.out.printf("name of the object myAccount", myAccount1.getName());
    }


}

