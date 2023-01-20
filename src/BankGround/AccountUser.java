package BankGround;

public class AccountUser{
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

   // public AccountUser() {
    //}

    public AccountUser(String number,double balance, String customerName,
                       String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setDeposit(double depositAmount){
        this.balance += depositAmount;
    }

    public void setWithDrawal(double withDrawalAmount){
        if(this.balance - withDrawalAmount <= 0){
            System.out.printf("balance" + withDrawalAmount,"process");
        }else{
            this.balance -= withDrawalAmount;
            System.out.println("withdraw" + withDrawalAmount  + balance);
        }

    }
    public String getNumber(String s) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName(String egusi2Sweet) {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber(String s) {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    }

