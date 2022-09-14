package TaxCollection;

public class FairTaxCalculate {

       private final double FAIR_TAX_RATE = 23;
    private double totalprice = 0.0;


    public double getTotalprice() {
        return totalprice;
    }
       public double calculateTax(double price){
         return (FAIR_TAX_RATE/100)* price;
       }
    public double calculateTotalprice( double price){
           return totalprice;
    }
    public void setTotalprice(double totalprice){
        this.totalprice = totalprice;
    }

    public double calculateTotalPrice(double price) {
        totalprice += price;
        return totalprice;
    }

}
