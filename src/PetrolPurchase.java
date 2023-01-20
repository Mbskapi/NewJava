public class PetrolPurchase {
    private  String location;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double discount;

    public String getLocation() {
        return location;
    }

    public PetrolPurchase(){

    }

    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double discount) {
            this.location = location;
            this.petrolType = petrolType;
            this.quantity = quantity;
            this.pricePerLiter = pricePerLiter;
            this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public double getPurchaseMount(){
        return (quantity * pricePerLiter) - getDiscount();
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

