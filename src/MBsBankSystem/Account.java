//package MBsBankSystem;
//
//public class Account {
//    private String name;
//    private String number;
//    private int balance;
//
//    public Account(String accountNumber, String accountName){
//        number = accountNumber;
//        name = accountName;
//
//    }
//
//        public int getBalance(String pin){
//        if(isCorrect(pin))return balance;
//        return 0;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setAccountNumber(String accountNumber){
//        this.number= accountNumber;
//    }
//
//    public String getAccountNumber(){
//        return number;
//    }
//
//    public String getPin(){
//        return pin;
//    }
//
//    public double getBalance(){
//        return balance;
//    }
//
//    public void deposit(int amount) {
//        boolean isValidAmount = amount > 0;
//        if (isValidAmount) balance = getBalance("8080") + amount;
//    }
//
//    public void withdraw(int amount, String pin) {
//        boolean amountIsValid = balance > amount && amount > 0;
//        if (isCorrect(pin) && amountIsValid) balance -= amount;
//    }
//    private boolean isCorrect(String pin){ return pin.equals(this.pin); }
//}
