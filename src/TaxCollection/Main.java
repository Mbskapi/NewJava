package TaxCollection;

import java.util.Scanner;

public class Main {
    private final FairTaxCalculate fairTaxCalculate = new FairTaxCalculate();

    public static void main(String[] args) {
        Main main = new Main();
        main.taxMachine();
    }
    public void taxMachine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of products");
        int numberOfProducts = scanner.nextInt();

        for(int index = 1; index < numberOfProducts; index++) {
            System.out.println("enter the name of product");
            String productName = scanner.next();
            System.out.printf("enter price of %s", productName);
            double productPrice = scanner.nextDouble();
            Product product = new Product(productName, productPrice);
            fairTaxCalculate.calculateTotalPrice(product.getPrice());
        }
            double grandTotal = fairTaxCalculate.calculateTotalprice(fairTaxCalculate.getTotalprice());
            double tax = fairTaxCalculate.calculateTax(grandTotal);
        System.out.printf("God go bless you, pay %f now!!!", tax);
        }

}
