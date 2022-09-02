import java.util.Scanner;

public class AnAccount {

    private String name;
    private double AccountBalance;
    public AnAccount(String name, double balance){     // constructor, passing in parameters;
        this.name = name;
        this.AccountBalance = balance;
  }


    public void changeTheName(String name) {    // we azoom the account has a name.
        this.name = name;
    }

    public void deposit(int depositAmount){ //
        this.AccountBalance = AccountBalance + depositAmount;
    }


    public double withdraw(int withdrawAmount){
        AccountBalance = AccountBalance - withdrawAmount;
        return AccountBalance;
    }
    public String getName(){
        return name;
    }


    public static void main(String[] args) { // a driver class most have a psvm'

        AnAccount favourAccount1 = new AnAccount("Capi", 1000.67); //creating of an object of a class

        favourAccount1.changeTheName("Capi");

        AnAccount vivianAccount2 = new AnAccount("kelvin", 5000.08);
        vivianAccount2.changeTheName("kelvin");

//        favourAccount1.deposit(500);
//
//        System.out.println(favourAccount1.AccountBalance);


        favourAccount1.withdraw(600);
        System.out.println(favourAccount1.AccountBalance);

        vivianAccount2.withdraw( 3000);
        System.out.println(vivianAccount2.AccountBalance);



    }

}
