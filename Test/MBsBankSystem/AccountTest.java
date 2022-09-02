//package MBsBankSystem;
//
//import MBsBankSystem.Account;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AccountTest {
//    private Account bankeAccount;
//
//    @BeforeEach
//    public void setup(){
//        bankeAccount = new Account("1", "Emmy", "8080");
//    }
//
//    @Test
//    public void accountCanBeCreatedTest(){
//        assertNotNull("bankeAccount");
//        assertEquals(0, bankeAccount.getBalance("8080"));
//    }
//
//    @Test
//    public void depositMoney_balanceIncreaseTest(){
//        assertEquals(0,bankeAccount.getBalance("8080"));
//        bankeAccount.deposit(2_000);
//        assertEquals(2_000, bankeAccount.getBalance("8080"));
//    }
//
//    @Test
//    public void cannotDepositNegativeAmountTest(){
//        assertEquals(0, bankeAccount.getBalance("8080"));
//        bankeAccount.deposit(-2_500);
//        assertEquals(0, bankeAccount.getBalance("8080"));
//    }
//
//    @Test
//    @DisplayName("Getting balsnce with invalid pin return zero")
//    public void getBalanceWithWrongPin_returnZeroTest(){
//        bankeAccount.deposit(2000);
//        int myBalance = bankeAccount.getBalance("8877");
//        assertEquals(0, myBalance);
//    }
//
//    @Test
//    @DisplayName("Getting balance with valid pin return real balance")
//    public void getBalanceWithRightPin(){
//        bankeAccount.deposit(2000);
//        int myBalance = bankeAccount.getBalance("8080");
//        assertEquals(2000, myBalance);
//    }
//
//    @Test
//    public void withdrawWIthRightPinWorksTest(){
//        bankeAccount.deposit(5000);
//        bankeAccount.withdraw(2000, "8080");
//        assertEquals(3000, bankeAccount.getBalance("8080"));
//    }
//
//    @Test
//    public void withdrawWithWrongPinDOesNotWorkTest(){
//        bankeAccount.deposit(5000);
//        bankeAccount.withdraw(2000, "8787");
//        assertEquals(5000, bankeAccount.getBalance("8080"));
//    }
//
//    @Test
//    @DisplayName("If pin is correct and amount exceed balance, withdraw does not work")
//    public void withdrawWithRightPinANdHighAmountDOesNotWOrk(){
//        bankeAccount.deposit(5000);
//        bankeAccount.withdraw(10000, "8080");
//        assertEquals(5000, bankeAccount.getBalance("8080"));
//    }
//
//
//
//}
