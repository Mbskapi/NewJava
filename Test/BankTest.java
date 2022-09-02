//import chapter3.Account;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class BankTest {
//    private Bank mybank;
//    @BeforeEach
//    public void startWithThis(){
//        mybank = new Bank();
//    }
//
//    @Test
//    public void bankExistTest(){
//        assertNotNull(mybank);
//    }
//    @Test
//    public void accountCanBeCreated(){
//        mybank.createAccountFor("Emmy", "8080");
//        assertEquals(1, mybank.getNumberOfCustomer());
//    }
//
//    @Test
//    public void createAccount_fineAccountByAccountNumber(){
//        mybank.createAccountFor(" Emmy", 8080);
//        assertEquals(1, mybank.getNumberOfCustomer());
//
//        Account account = mybank.findAccount("1");
//        assertEquals("Emmy", account.getName());
//}
//
//}
