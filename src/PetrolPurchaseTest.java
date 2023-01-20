import java.util.Scanner;

public class PetrolPurchaseTest {
    public static void main(String[] args) {
        calculateNetPurchaseAmount();
    }

    public static void calculateNetPurchaseAmount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Kapimart Petrol Station!!!!");

        System.out.println("Enter litres of petrol bought: ");
        int litresBought = input.nextInt();
        petrolPurchase.setQuantity(litresBought);

        System.out.println("Enter price per litre: ");
        double pricePerlitre = input.nextDouble();
        petrolPurchase.setPricePerLiter(pricePerlitre);

        System.out.println("Enter percentage discount: ");
        double discount = input.nextDouble();
        petrolPurchase.setDiscount(discount);

        double netPurchaseAmount = petrolPurchase.getQuantity() * petrolPurchase.getPricePerLiter() * petrolPurchase.getDiscount();
        System.out.printf("%s %f","Your net purchase amount is: ", netPurchaseAmount);
    }


}
