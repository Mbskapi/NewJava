public class Receipts {

    private int payment;
    private String customerName;
    private int itemQuantity;
    private double pricePerUnite;
    private double totalPrice;

        public Receipts(String UserItemBought, int piecesQuantity, double pricePerUnit, double totalPrice){
            this.totalPrice= totalPrice;
                    this.itemQuantity = itemQuantity;
        }
            public void setCustomerName(String customerName){
                this.customerName = customerName;
            }
            private String getCustomerName(){
            return customerName;
            }
        }






