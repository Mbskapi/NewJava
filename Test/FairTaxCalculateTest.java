import TaxCollection.FairTaxCalculate;
import TaxCollection.Product;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class FairTaxCalculateTest {
    private FairTaxCalculate fairTaxCalculate;

    @BeforeEach
    void setup(){
        fairTaxCalculate = new FairTaxCalculate();
    }

    @Test
    public void testThatFairTaxPaymentCanBeMade(){
        //given
        Product product = new Product("milo", 30.00);
        //when
        double tax = fairTaxCalculate.calculateTax(product.getPrice());
        //assert
        assertEquals(6.9, tax);

    }
    @Test
    public void testThatProductsTotalPriceCanBeSum(){
        //when
        fairTaxCalculate.setTotalprice(50.00);
        //when
        double totalprice = fairTaxCalculate.calculateTotalPrice(30.00);
        //assert
        assertEquals(80.00, totalprice);

    }

}
