//package MBsBankSystem;
//
//public class Bank {
//
//    private int numberOfCustomers;
//    private Account[] accounts = new Account[10];
//
//    public void createAccountFor(String accountName, String pin){
//        Account account = new Account((numberOfCustomers+1)+"", accountName, pin);
//        accounts[numberOfCustomers] = account;
//        numberOfCustomers++;
//    }
//    public int getNumberOfCustomer() {return numberOfCustomers;}
//
//    public Account findAccount(String accountNumber) {
//        for (Account account : accounts){
//            if (account.getNumber().equals(accountNumber))
//                return account;
//        }
//        return null;
//    }
//}
